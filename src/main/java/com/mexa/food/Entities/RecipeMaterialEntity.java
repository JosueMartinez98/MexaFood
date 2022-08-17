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
@Entity(name = "recipe_materials")
@Table(name = "recipe_materials", schema = "main", catalog = "mexafood")
public class RecipeMaterialEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "fk_recipe")
    private RecipeEntity fkRecipe;

    @ManyToOne()
    @JoinColumn(name = "fk_material")
    private MaterialEntity fkMaterial;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RecipeEntity getFkRecipe() {
        return fkRecipe;
    }

    public void setFkRecipe(RecipeEntity fkRecipe) {
        this.fkRecipe = fkRecipe;
    }

    public MaterialEntity getFkMaterial() {
        return fkMaterial;
    }

    public void setFkMaterial(MaterialEntity fkMaterial) {
        this.fkMaterial = fkMaterial;
    }

    
}
