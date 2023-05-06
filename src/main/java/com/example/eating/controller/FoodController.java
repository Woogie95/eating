package com.example.eating.controller;

import com.example.eating.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/chinese")
    public ResponseEntity<?> getRandomChineseFood() {
        Long chineseId = foodService.getRandomFoodId("중식");
        if (chineseId == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("중식 음식이 존재하지 않습니다.");
        }
        return ResponseEntity.ok("추천 음식 ID: " + chineseId);
    }

    @GetMapping("/japanese")
    public ResponseEntity<?> getRandomJapaneseFood() {
        Long japaneseId = foodService.getRandomFoodId("일식");
        if (japaneseId == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("일식 음식이 존재하지 않습니다.");
        }
        return ResponseEntity.ok("추천 음식 ID: " + japaneseId);
    }

    @GetMapping("/korean")
    public ResponseEntity<?> getRandomKoreanFood() {
        Long koreanId = foodService.getRandomFoodId("한식");
        if (koreanId == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("한식 음식이 존재하지 않습니다.");
        }
        return ResponseEntity.ok("추천 음식 ID: " + koreanId);
    }

    @GetMapping("/western")
    public ResponseEntity<?> getRandomWesternFood() {
        Long westernId = foodService.getRandomFoodId("양식");
        if (westernId == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("양식 음식이 존재하지 않습니다.");
        }
        return ResponseEntity.ok("추천 음식 ID: " + westernId);
    }

    @GetMapping("/other")
    public ResponseEntity<?> getRandomOtherFood() {
        Long otherId = foodService.getRandomFoodId("기타");
        if (otherId == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("기타 음식이 존재하지 않습니다.");
        }
        return ResponseEntity.ok("추천 음식 ID: " + otherId);
    }

}
