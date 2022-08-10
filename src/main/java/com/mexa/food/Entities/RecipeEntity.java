package com.mexa.food.Entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "recipes")
@Table(name = "recipes", schema = "main", catalog = "mexafood")
public class RecipeEntity {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "register_date")
    private Date registerDate;

    @Column(name = "state")
    private String State;

    @Column(name = "description")
    private String description;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @OneToMany(mappedBy = "fkRecipe")
    private List<RecipeDetailEntity> recipeDetailsList;
    
    @OneToMany(mappedBy = "fkRecipe")
    private List<StepEntity> stepsList;

    @OneToMany(mappedBy = "fkRecipe")
    private List<RecipeMaterialEntity> recipeMaterialsList;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<RecipeDetailEntity> getRecipeDetailsList() {
        return recipeDetailsList;
    }

    public void setRecipeDetailsList(List<RecipeDetailEntity> recipeDetailsList) {
        this.recipeDetailsList = recipeDetailsList;
    }

    public List<StepEntity> getStepsList() {
        return stepsList;
    }

    public void setStepsList(List<StepEntity> stepsList) {
        this.stepsList = stepsList;
    }

    public List<RecipeMaterialEntity> getRecipeMaterialsList() {
        return recipeMaterialsList;
    }

    public void setRecipeMaterialsList(List<RecipeMaterialEntity> recipeMaterialsList) {
        this.recipeMaterialsList = recipeMaterialsList;
    }
}
