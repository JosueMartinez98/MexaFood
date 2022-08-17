package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.StepEntity;

@Repository()
public interface IStepRepository extends JpaRepository<StepEntity, Integer> {
    
}
