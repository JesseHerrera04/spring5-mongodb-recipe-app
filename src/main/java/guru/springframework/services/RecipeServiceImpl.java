package guru.springframework.services;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.converters.RecipeCommandToRecipe;
import guru.springframework.converters.RecipeToRecipeCommand;
import guru.springframework.domain.Recipe;
import guru.springframework.exceptions.NotFoundException;
import guru.springframework.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Services; Class: RecipeServiceImpl
 * RecipeService Implementation
 */

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeCommandToRecipe recipeCommandToRecipe;
    private final RecipeToRecipeCommand recipeToRecipeCommand;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeCommandToRecipe recipeCommandToRecipe, RecipeToRecipeCommand recipeToRecipeCommand) {
        this.recipeRepository = recipeRepository;
        this.recipeCommandToRecipe = recipeCommandToRecipe;
        this.recipeToRecipeCommand = recipeToRecipeCommand;
    } // End RecipeServiceImpl

    @Override
    public Set<Recipe> getRecipes() {

        log.debug("I'm in the service");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    } // End getRecipes()

    @Override
    public Recipe findById(String id) {

        Optional<Recipe> recipeOptional = recipeRepository.findById(id);

        // If not present, throw NotFoundException
        if(recipeOptional.isEmpty()) {
            throw new NotFoundException("Recipe Not Found. For ID: " + id);
        }

        return recipeOptional.get();
    } // End findById()

    @Override
    @Transactional
    public RecipeCommand findCommandById(String id) {
        return recipeToRecipeCommand.convert(findById(id));
    } // End findCommandById()

    @Override
    @Transactional
    public RecipeCommand saveRecipeCommand(RecipeCommand command) {
        Recipe detachedRecipe = recipeCommandToRecipe.convert(command);

        // If this is an update, we only need the Notes ID
        if (detachedRecipe.getId() != null && detachedRecipe.getNotes() != null) {
            recipeRepository.findById(detachedRecipe.getId())
                    .ifPresent(existing -> {
                        if (existing.getNotes() != null) {
                            detachedRecipe.getNotes().setId(existing.getNotes().getId());
                        }
                    });
        }

            Recipe savedRecipe = recipeRepository.save(detachedRecipe);
        log.debug("Saved RecipeId: " + savedRecipe.getId());
        return recipeToRecipeCommand.convert(savedRecipe);
    } // End saveRecipeCommand()

    @Override
    public void deleteById(String idToDelete) {
        recipeRepository.deleteById(idToDelete);
        log.debug("Deleted RecipeId: " + idToDelete + " from the database.");
    };
} // End RecipeServiceImpl Class
