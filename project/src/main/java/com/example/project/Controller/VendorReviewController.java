package com.example.project.Controller;

import com.example.project.Service.VendorReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vendor-review")
@RequiredArgsConstructor
public class VendorReviewController {//Waleed

    private final VendorReviewService vendorReviewService;


}
