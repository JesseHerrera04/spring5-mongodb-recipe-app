package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Repositories; Interface: RecipeRepository
 * Interface for Recipe Repository
 */

public interface RecipeRepository  extends CrudRepository<Recipe, String> {
} // End RecipeRepository Interface
