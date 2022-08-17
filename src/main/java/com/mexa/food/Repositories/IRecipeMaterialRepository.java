package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.RecipeMaterialEntity;

@Repository()
public interface IRecipeMaterialRepository extends JpaRepository<RecipeMaterialEntity, Integer> {
    
}
