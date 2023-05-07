package com.example.eating.controller;

import com.example.eating.entity.Food;
import com.example.eating.service.FoodService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/")
    public String homeForm() {
        return "home";
    }

    @GetMapping("/{id}")
    public String korans(@PathVariable Long id) {
        return foodService.find(id).getName();
    }







}
