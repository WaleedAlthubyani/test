package com.example.project.Service;

import com.example.project.DTO.ProductReviewIDTO;
import com.example.project.Model.ProductReview;
import com.example.project.Repository.ProductReviewRepository;
import com.example.project.api.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductReviewService {//Waleed

    private final ProductReviewRepository productReviewRepository;

//    public List<ProductReview> getAllProductReviews(Integer id){
//        return
//    }

    public void addProductReview(Integer id, ProductReviewIDTO productReview){
        //if

        ProductReview productReview1=new ProductReview();
        productReview1.setQualityRating(productReview.getQualityRating());
        productReview1.setPackageRating(productReview.getPackageRating());
        productReview1.setComment(productReview.getComment());
        productReview1.setCreatedAt(LocalDate.now());
        productReview1.setOverallRating(((double)productReview.getPackageRating()+productReview.getQualityRating())/2.0);
        productReviewRepository.save(productReview1);
    }

    public void updateProductReview(Integer id,ProductReviewIDTO productReview){
        ProductReview oldProductReview=productReviewRepository.findProductReviewById(id);

        if (oldProductReview==null) throw new ApiException("Product review not found");

        oldProductReview.setPackageRating(productReview.getPackageRating());
        oldProductReview.setQualityRating(productReview.getQualityRating());
        oldProductReview.setOverallRating(((double)productReview.getPackageRating()+productReview.getQualityRating())/2.0);
        oldProductReview.setComment(productReview.getComment());
        oldProductReview.setUpdatedAt(LocalDate.now());

        productReviewRepository.save(oldProductReview);
    }

    public void deleteProductReview(Integer id){
        ProductReview productReview=productReviewRepository.findProductReviewById(id);

        if (productReview==null) throw new ApiException("Product review not found");

        productReviewRepository.delete(productReview);
    }
}
