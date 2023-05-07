package com.example.eating.service;

import com.example.eating.entity.Food;
import com.example.eating.entity.FoodCategory;
import com.example.eating.repository.FoodCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodCategoryRepository foodCategoryRepository;

    @Transactional
    public Food find(Long id) {
        FoodCategory foodCategory = foodCategoryRepository.findById(id).get();
        long idd = new Random().nextLong(2);
        return foodCategory.getFoods().get(Math.toIntExact(idd));
    }


}
