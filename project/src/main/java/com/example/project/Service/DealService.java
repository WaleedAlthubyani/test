package com.example.project.Service;

import com.example.project.DTO.DealIDTO;
import com.example.project.Model.Deal;
import com.example.project.Repository.DealRepository;
import com.example.project.api.ApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DealService {//Waleed

    private final DealRepository dealRepository;

//    public List<Deal> getAllProductDeals(Integer id){
//
//    }

//    public void addDeal(Integer id, Deal deal){
//        //if
//
//        deal.setOriginalPrice();
//        deal.setDiscountedPrice();
//        deal.setStartedAt(LocalDateTime.now());
//        deal.setEndsAt(LocalDateTime.now().plusDays(5));
//
//        dealRepository.save(deal);
//    }

    public void updateDeal(Integer id, DealIDTO deal){
        Deal oldDeal = dealRepository.findDealById(id);
        if (oldDeal==null) throw new ApiException("Deal not found");
        Double discount = switch (deal.getParticipantsLimit()) {
            case 3 -> 0.5;
            case 5 -> 0.10;
            case 10 -> 0.15;
            case 15 -> 0.20;
            case 20 -> 0.25;
            default -> 0.0;
        };

        if (discount==0.0) throw new ApiException("Participants limit can only be 3,5,10,15 or 20");

        oldDeal.setQuantity(deal.getQuantity());
//        oldDeal.setOriginalPrice(deal.getOriginalPrice());
        oldDeal.setDiscountedPrice(oldDeal.getOriginalPrice()-(oldDeal.getDiscountedPrice()*discount));
        dealRepository.save(oldDeal);
    }

    public void deleteDeal(Integer id,Integer dealId){
        Deal deal=dealRepository.findDealById(dealId);
        if (deal==null) throw new ApiException("Deal not found");

        dealRepository.delete(deal);
    }

//    public List<Deal> viewProductDeals(Integer id){
//        return dealRepository.findDealById(id);
//    }

//    public List<Deal> viewCustomerOpenedDeals(Integer id){
//        return dealRepository.findDealsByStatus("open");
//    }

//    public List<Deal> viewCustomerCompletedDeals(Integer id){
//        return dealRepository.findDealsByStatus("completed");
//    }

//    public List<Deal> viewVendorsOpenDeals(Integer id){
//        return dealRepository.
//    }


}
