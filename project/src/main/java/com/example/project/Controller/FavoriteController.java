package com.example.project.Controller;

import com.example.project.Model.Favorite;
import com.example.project.Service.FavoriteService;
import com.example.project.api.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/favorite")
@RequiredArgsConstructor
public class FavoriteController {//Waleed

    private FavoriteService favoriteService;

    @PostMapping("/add-product-to-favorite/{id}/{product-id}")
    public ResponseEntity addProductToFavorite(@PathVariable Integer id,@PathVariable(name = "product-id") Integer productId,@RequestBody @Valid Favorite favorite){
        favoriteService.addProductToFavorite(id,productId,favorite);
        return ResponseEntity.status(201).body(new ApiResponse("Product added to favorites list"));
    }

    @DeleteMapping("/remove-product-from-favorites/{id}")
    public ResponseEntity removeProductFromFavorites(@PathVariable Integer id){
        favoriteService.removeProductFromFavorite(id);
        return ResponseEntity.status(200).body(new ApiResponse("product removed from favorites successfully"));
    }
}
