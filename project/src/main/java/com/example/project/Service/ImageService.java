package com.example.project.Service;

import com.example.project.Model.Image;
import com.example.project.Repository.ImageRepository;
import com.example.project.api.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {//Waleed

    private final ImageRepository imageRepository;

//    public List<Image> getProductImages(Integer id){
//
//    }

//    public void addProductImage(Integer id, ImageDTO imageDTO){
//        //if
//
//        imageRepository.save(image);
//    }

//    public void removeProductImage(Integer id){
//        Image image=imageRepository.findImageById(id);
//        if (image==null) throw new ApiException("Image not found");
//
//        imageRepository.delete(image);
//    }

//    public void setImageAsDisplayImage(Integer id){
//        Image image=
//    }


}
