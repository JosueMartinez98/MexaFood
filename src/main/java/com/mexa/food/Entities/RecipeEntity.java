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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

}
