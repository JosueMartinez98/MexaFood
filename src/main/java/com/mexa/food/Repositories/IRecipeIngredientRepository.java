package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.RecipeIngredientEntity;

@Repository()
public interface IRecipeIngredientRepository extends JpaRepository<RecipeIngredientEntity, Integer> {
    
}
