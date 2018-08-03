package com.test.recipes.repository;

import org.springframework.data.repository.CrudRepository;
import com.test.recipes.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
