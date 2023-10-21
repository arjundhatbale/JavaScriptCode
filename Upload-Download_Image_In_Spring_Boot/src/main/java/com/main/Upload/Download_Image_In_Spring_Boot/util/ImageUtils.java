package com.main.Upload.Download_Image_In_Spring_Boot.util;


import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;

/*
    This class purpos is to compress the File size
    before store into the database
 */
public class ImageUtils {

    public static  byte[] comressImage(byte[] data){
        Deflater deflater = new Deflater();
        deflater.setLevel(Deflater.BEST_COMPRESSION);
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] tmp = new byte[4*1024];
        while (!deflater.finished()){
            int size = deflater.deflate(tmp);
            outputStream.write(tmp,0,size);
        }
        try {
            outputStream.close();
        }catch (Exception ignored){

        }
        return  outputStream.toByteArray();
    }



}
