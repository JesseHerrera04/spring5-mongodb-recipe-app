package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created on 8/2/2025 by Jesse H.
 * Package: Services; Interface: IngredientService
 * Interface for Ingredient Service
 */

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(String recipeId, String ingredientId);
} // End IngredientService Interface
