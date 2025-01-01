package com.example.project.Controller;

import com.example.project.DTO.ProductReviewIDTO;
import com.example.project.Service.ProductReviewService;
import com.example.project.api.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-review")
@RequiredArgsConstructor
public class ProductReviewController {//Waleed

    private final ProductReviewService productReviewService;

    @PostMapping("/add-product-review/{id}")
    public ResponseEntity addProductReview(@PathVariable Integer id, @RequestBody @Valid ProductReviewIDTO productReview){
        productReviewService.addProductReview(id,productReview);
        return ResponseEntity.status(201).body(new ApiResponse("Product review added successfully"));
    }

    @PutMapping("/update-product-review/{id}")
    public ResponseEntity updateProductReview(@PathVariable Integer id,@RequestBody @Valid ProductReviewIDTO productReview){
        productReviewService.updateProductReview(id,productReview);
        return ResponseEntity.status(200).body(new ApiResponse("Product review updated successfully"));
    }

    @DeleteMapping("/delete-product-review/{id}")
    public ResponseEntity deleteProductReview(@PathVariable Integer id){
        productReviewService.deleteProductReview(id);
        return ResponseEntity.status(200).body(new ApiResponse("Product review deleted successfully"));
    }
}
