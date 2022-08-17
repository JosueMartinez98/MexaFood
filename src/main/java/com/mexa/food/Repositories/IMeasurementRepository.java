package com.mexa.food.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mexa.food.Entities.MeasurementEntity;

@Repository()
public interface IMeasurementRepository extends JpaRepository<MeasurementEntity, Integer> {
    
}
