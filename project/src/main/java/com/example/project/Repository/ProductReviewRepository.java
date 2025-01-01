package com.example.project.Repository;

import com.example.project.Model.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview,Integer> {//Waleed

    ProductReview findProductReviewById(Integer id);
}
