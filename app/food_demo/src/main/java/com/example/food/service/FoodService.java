package com.example.food.service;

import com.example.food.model.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public Food[] getFoods(){
        Food[] foods = {new Food("burrito", 7.2), new Food("pizza", 12.8), new Food("soda", 3.0)};
        return foods;
    }
}
