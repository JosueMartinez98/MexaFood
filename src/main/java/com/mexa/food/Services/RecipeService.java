package com.mexa.food.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mexa.food.Repositories.IRecipeDetailRepository;
import com.mexa.food.Repositories.IRecipeIngredientRepository;
import com.mexa.food.Repositories.IRecipeMaterialRepository;
import com.mexa.food.Repositories.IRecipeRepository;

@Service()
public class RecipeService {
    
    @Autowired
    private IRecipeRepository recipeRepository;

    @Autowired
    private IRecipeDetailRepository recipeDetailRepository;
    
    @Autowired
    private IRecipeIngredientRepository recipeIngredientRepository;

    @Autowired
    private IRecipeMaterialRepository recipeMaterialRepository;
}
