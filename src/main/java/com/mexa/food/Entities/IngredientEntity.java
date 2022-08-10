package com.mexa.food.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "ingredients")
@Table(name = "ingredients", schema = "main", catalog = "mexafood")
public class IngredientEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany(mappedBy = "fkIngredient")
    private List<RecipeIngredientEntity> recipeIngredientsList;

    // Getters
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isActive() {
        return isActive;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    
}
