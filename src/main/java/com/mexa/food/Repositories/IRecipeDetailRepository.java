package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.RecipeDetailEntity;

@Repository()
public interface IRecipeDetailRepository extends JpaRepository<RecipeDetailEntity, Integer> {
    
}
