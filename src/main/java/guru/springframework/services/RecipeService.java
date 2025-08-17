package guru.springframework.services;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Services; Interface: RecipeService
 * Interface for Recipe Service
 */

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(String id);

    void deleteById(String idToDelete);
} // End RecipeService Interface
