package com.example.project.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductReviewIDTO {//Waleed

    @NotNull(message = "Please enter a quality rating")
    @Min(value = 1,message = "Quality rating must be 1 or more")
    @Max(value = 5,message = "Quality rating must be 5 or less")
    private Integer qualityRating;

    @NotNull(message = "Please enter a package rating")
    @Min(value = 1,message = "package rating must be 1 or more")
    @Max(value = 5,message = "package rating must be 5 or less")
    private Integer packageRating;

    @NotEmpty(message = "Please enter a comment")
    @Size(max = 255,message = "Comment must be 255 characters or less")
    private String comment;
}
