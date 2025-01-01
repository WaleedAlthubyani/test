package com.example.project.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageDTO {//Waleed

    @NotEmpty(message = "Please enter a description")
    @Size(max = 255,message = "description can't be more than 255 characters long")
    private String description;

    @NotNull(message = "Please upload an image")
    private byte[] image;
}
