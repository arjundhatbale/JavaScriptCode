package com.main.Upload.Download_Image_In_Spring_Boot.service;

import com.main.Upload.Download_Image_In_Spring_Boot.entity.ImageData;
import com.main.Upload.Download_Image_In_Spring_Boot.repository.StorageRepository;
import com.main.Upload.Download_Image_In_Spring_Boot.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    public String uploadImage(MultipartFile file) throws IOException {
        ImageData imageData = storageRepository.save(ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.comressImage(file.getBytes())).build());
        if(imageData!=null){
            return  "file uploaded successfully : " + file.getOriginalFilename();
        }
        return  null;
    }

//    public  byte[] downloadImage(String fileName){
//        Optional<ImageData> dbImageData = storageRepository.findByName(fileName);
//        byte[] images = ImageUtils.comressImage(dbImageData.get().getImageData());
//        return images;
//    }

    public byte[] downloadImage(String fileName) {
        Optional<ImageData> dbImageDataOptional = storageRepository.findByName(fileName);

        if (dbImageDataOptional.isPresent()) {
            ImageData dbImageData = dbImageDataOptional.get();
            return ImageUtils.comressImage(dbImageData.getImageData());
        } else {
            throw new NoSuchElementException("No value present for fileName: " + fileName);
        }
    }


}
