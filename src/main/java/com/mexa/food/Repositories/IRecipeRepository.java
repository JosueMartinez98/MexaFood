package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.RecipeEntity;

@Repository()
public interface IRecipeRepository extends JpaRepository<RecipeEntity, Integer> {
    
}
