package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Recipe
 * POJO/Entity for Recipes
 */

@Getter
@Setter
public class Recipe {

    private String id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Set<Ingredient> ingredients = new HashSet<>();
    private Byte[] image;
    private Difficulty difficulty;
    private Notes notes;
    private Set<Category> categories = new HashSet<>();


    // Helper Methods
    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
            notes.setRecipe(this);
        }
    } // End setNotes()

    public Recipe addIngredient(Ingredient ingredient) {
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    } // End addIngredient()
} // End Recipe Class
