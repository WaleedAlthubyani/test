package com.example.project.Repository;

import com.example.project.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image,Integer> {//Waleed

    Image findImageById(Integer id);
}
