package com.mexa.food.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mexa.food.Services.RecipeService;

@RestController()
public class RecipeController {
    
    @Autowired
    private RecipeService recipeService;

}
