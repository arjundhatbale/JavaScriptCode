package com.main.Upload.Download_Image_In_Spring_Boot.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "ImageData")
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String type;
    @Lob
    @Column(name = "imagedata", length = 1000)
    private  byte[] imageData;
}
