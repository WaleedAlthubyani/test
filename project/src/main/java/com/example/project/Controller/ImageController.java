package com.example.project.Controller;

import com.example.project.Service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/image")
@RequiredArgsConstructor
public class ImageController {//Waleed

    private final ImageService imageService;
}
