package com.mexa.food.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "measurement_units")
@Table(name = "measurement_units", schema = "main", catalog = "mexafood")
public class MeasurementEntity {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "keyword")
    private String keyword;

    @OneToMany(mappedBy = "fkMeasurement")
    private List<RecipeIngredientEntity> recipeIngredientsList;
    
}
