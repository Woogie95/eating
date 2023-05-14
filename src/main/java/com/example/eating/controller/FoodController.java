package com.example.eating.controller;

import com.example.eating.entity.Food;
import com.example.eating.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/")
    public String showMenu() {
        return "select";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getRandomMenu(@PathVariable Long id) {
        Food categoryId = foodService.findCategoryId(id);
        System.out.println(categoryId.getName());
        return categoryId.getName();
    }

}
