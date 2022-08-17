package com.mexa.food.Entities;

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
@Entity(name = "recipe_details")
@Table(name = "recipe_details", schema = "main", catalog = "mexafood")
public class RecipeDetailEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "fk_step")
    private StepEntity fkStep;

    @ManyToOne()
    @JoinColumn(name = "fk_recipe")
    private RecipeEntity fkRecipe;

}
