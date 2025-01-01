package com.example.project.Controller;

import com.example.project.DTO.DealIDTO;
import com.example.project.Service.DealService;
import com.example.project.api.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/deal")
public class DealController {//Waleed

    private final DealService dealService;

    @PutMapping("/update-deal/{id}")
    public ResponseEntity updateDeal(@PathVariable Integer id,@RequestBody @Valid DealIDTO deal){
        dealService.updateDeal(id,deal);
        return ResponseEntity.status(200).body(new ApiResponse("Deal updated successfully"));
    }

    @DeleteMapping("/delete-deal/{id}/{deal-id}")
    public ResponseEntity deleteDeal(@PathVariable Integer id,@PathVariable(name = "deal-id") Integer dealId){
        dealService.deleteDeal(id,dealId);
        return ResponseEntity.status(200).body(new ApiResponse("Deal deleted successfully"));
    }
}
