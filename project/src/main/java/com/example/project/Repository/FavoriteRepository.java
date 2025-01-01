package com.example.project.Repository;

import com.example.project.Model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite,Integer> {//Waleed

    Favorite findFavoriteById(Integer id);
}
