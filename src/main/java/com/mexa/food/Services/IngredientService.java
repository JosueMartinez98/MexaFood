package com.mexa.food.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mexa.food.Repositories.IIngrediendRepository;

@Service()
public class IngredientService {
    
    @Autowired
    private IIngrediendRepository ingrediendRepository;
}
