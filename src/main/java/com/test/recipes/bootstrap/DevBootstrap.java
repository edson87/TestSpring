package com.test.recipes.bootstrap;

import com.test.recipes.repository.RecipeRepository;
import com.test.recipes.repository.UsersRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private UsersRepository usersRepository;
    private RecipeRepository recipeRepository;

    public DevBootstrap(UsersRepository usersRepository, RecipeRepository recipeRepository) {
        this.usersRepository = usersRepository;
        this.recipeRepository = recipeRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }

    public void init(){

    }
}
