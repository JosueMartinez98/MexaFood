package com.mexa.food.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "recipe_ingredients")
@Table(name = "recipe_ingredients", schema = "main", catalog = "mexafood")
public class RecipeIngredientEntity {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantity")
    private float quantity;

    @ManyToOne()
    @JoinColumn(name = "fk_ingredient")
    private IngredientEntity fkIngredient;

    @ManyToOne()
    @JoinColumn(name = "fk_measurement")
    private MeasurementEntity fkMeasurement;

    @ManyToOne()
    @JoinColumn(name = "fk_recipe")
    private RecipeEntity fkRecipe;
}
