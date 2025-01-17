package com.example.project.Repository;

import com.example.project.Model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository extends JpaRepository<Deal,Integer> {//Waleed

    Deal findDealById(Integer id);

    List<Deal> findDealsByStatus(String status);
}
