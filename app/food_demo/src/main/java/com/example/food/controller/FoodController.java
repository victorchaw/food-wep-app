package com.example.food.controller;

import com.example.food.model.Food;
import com.example.food.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Hello Healthy Lovers! I'm from the food controller");

        Food[] foods = foodService.getFoods();

        model.addAttribute("foods", foods);
        return "home";
    }
}
