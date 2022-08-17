package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.IngredientEntity;

@Repository()
public interface IIngrediendRepository extends JpaRepository<IngredientEntity, Integer> {
    
}
