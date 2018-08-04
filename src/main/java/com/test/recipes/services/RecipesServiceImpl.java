package com.test.recipes.services;

import com.test.recipes.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public class RecipesServiceImpl extends GenericServiceImpl<Recipe> implements RecipesService {

    @Override
    protected CrudRepository<Recipe, Long> getRepository() {
        return null;
    }
}
