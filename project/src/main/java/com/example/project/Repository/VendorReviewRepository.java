package com.example.project.Repository;

import com.example.project.Model.VendorReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorReviewRepository extends JpaRepository<VendorReview,Integer> {//Waleed

    VendorReview findVendorReviewById(Integer id);
}
