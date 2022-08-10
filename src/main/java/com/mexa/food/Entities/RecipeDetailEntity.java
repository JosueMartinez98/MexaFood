package com.mexa.food.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StepEntity getFkStep() {
        return fkStep;
    }

    public void setFkStep(StepEntity fkStep) {
        this.fkStep = fkStep;
    }

    public RecipeEntity getFkRecipe() {
        return fkRecipe;
    }

    public void setFkRecipe(RecipeEntity fkRecipe) {
        this.fkRecipe = fkRecipe;
    }
    
}
