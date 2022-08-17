package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.MaterialEntity;

@Repository()
public interface IMaterialRepository extends JpaRepository<MaterialEntity, Integer> {
    
}
