package com.main.Upload.Download_Image_In_Spring_Boot.repository;

import com.main.Upload.Download_Image_In_Spring_Boot.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData, Long> {

     Optional<ImageData> findByName(String fileName);
}
