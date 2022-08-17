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
}
