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
    public String board(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "select";
    }

    @PostMapping("/board/writer")
    public String writerBoard(Board board) {
        boardService.write(board);
        return "redirect:/board";
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Food getRandomMenu(@PathVariable Long id) {
        return foodService.findCategoryId(id);
    }

}
