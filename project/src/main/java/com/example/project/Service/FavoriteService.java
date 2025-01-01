package com.example.project.Service;

import com.example.project.Model.Favorite;
import com.example.project.Repository.FavoriteRepository;
import com.example.project.api.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavoriteService {//Waleed

    private final FavoriteRepository favoriteRepository;

//    public List<Favorite> getCustomerFavorites(Integer id){
//        //if
//
//        return favoriteRepository.findAll();
//    }

    public void addProductToFavorite(Integer id, Integer productId,Favorite favorite){
//       if ()
//       if ()

        favoriteRepository.save(favorite);
    }

    public void removeProductFromFavorite(Integer id){
        Favorite favorite=favoriteRepository.findFavoriteById(id);

        if (favorite==null) throw new ApiException("Favorite not found");

        favoriteRepository.delete(favorite);
    }
}
