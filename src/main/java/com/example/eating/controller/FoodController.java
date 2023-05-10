package com.example.eating.controller;

import com.example.eating.entity.Food;
import com.example.eating.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class FoodController {

    private final FoodService foodService;

    // restful api 공부 해서 사용해야 함
    @GetMapping("/{id}") // 여기로 id값 또는 내용이 들어오고 그 다음 서비스로 갑니다
    public Food getRandomMenu(@PathVariable Long id) {
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        System.out.println(foodService.gg(id).getName());
        return foodService.gg(id);
    }

}
