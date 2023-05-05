package com.example.eating.service;

import com.example.eating.entity.Food;
import com.example.eating.entity.FoodCategory;
import com.example.eating.repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public Long getRandomFoodId(String category) {
        List<Food> foods = foodRepository.findByCategory(category);
        if (foods.isEmpty()) {
            return null;
        }
        int randomIndex = new Random().nextInt(foods.size());
        return foods.get(randomIndex).getId();
    }

}
