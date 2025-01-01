package com.example.project.Service;

import com.example.project.Model.VendorReview;
import com.example.project.Repository.VendorReviewRepository;
import com.example.project.api.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VendorReviewService {//Waleed

    private final VendorReviewRepository vendorReviewRepository;

//    public List<VendorReview> getVendorReviews(Integer id){
//
//    }

//    public void createAVendorReview(Integer id,VendorReview vendorReview){
//       if ()
//
//        vendorReview.setCreatedAt(LocalDate.now());
//        vendorReview.setOverallRating(((double)vendorReview.getDeliveryRating()+vendorReview.getServiceRating()+vendorReview.getReturnPolicyRating()+vendorReview.getProductQualityRating())/4.0);
//
//        vendorReviewRepository.save(vendorReview);
//    }

//    public void deleteVendorReview(Integer id){
//        VendorReview vendorReview=vendorReviewRepository.findVendorReviewById(id);
//        if (vendorReview==null) throw new ApiException("Vendor review not found");
//
//        vendorReviewRepository.delete(vendorReview);
//    }
}
