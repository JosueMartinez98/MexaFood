package com.mexa.food.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "steps")
@Table(name = "steps", schema = "main", catalog = "mexafood")
public class StepEntity {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "step")
    private int step;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne()
    @JoinColumn(name = "fk_recipe")
    private RecipeEntity fkRecipe;

    @OneToMany(mappedBy = "fkStep")
    private List<RecipeDetailEntity> fkRecipeDetail;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecipeEntity getFkRecipe() {
        return fkRecipe;
    }

    public void setFkRecipe(RecipeEntity fkRecipe) {
        this.fkRecipe = fkRecipe;
    }

    public List<RecipeDetailEntity> getFkRecipeDetail() {
        return fkRecipeDetail;
    }

    public void setFkRecipeDetail(List<RecipeDetailEntity> fkRecipeDetail) {
        this.fkRecipeDetail = fkRecipeDetail;
    }

    
}
