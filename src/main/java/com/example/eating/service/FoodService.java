package com.example.eating.service;

import com.example.eating.entity.Food;
import com.example.eating.entity.FoodCategory;
import com.example.eating.repository.FoodCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodCategoryRepository foodCategoryRepository;

    public Food gg(Long id) { // 전달 받은 id, 내용으로 레포를 탐색해 원하는 값을 찾아, 서비스 레이어 기능을 수행하고 결과값을 리턴합니다.
        FoodCategory foodCategory = foodCategoryRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        long l = new Random().nextLong(2);
        return foodCategory.getFoods().get(Math.toIntExact(l));
    }

}
