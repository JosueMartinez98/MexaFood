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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    
}
