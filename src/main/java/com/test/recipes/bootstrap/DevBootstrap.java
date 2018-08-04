package com.test.recipes.bootstrap;

import com.test.recipes.model.Recipe;
import com.test.recipes.model.Users;
import com.test.recipes.repository.RecipeRepository;
import com.test.recipes.repository.UsersRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private UsersRepository usersRepository;
    private RecipeRepository recipeRepository;

    public DevBootstrap(UsersRepository usersRepository, RecipeRepository recipeRepository) {
        this.usersRepository = usersRepository;
        this.recipeRepository = recipeRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData(){
        Users juan = new Users();
        juan.setEmail("juan@hotmail.com");
        juan.setPassword("123456");
        juan.setName("Juan Perez");
        juan.setBirthday_date(new Date(2018, 8 ,3));
        usersRepository.save(juan);

        Recipe ChocoCookies = new Recipe();
        ChocoCookies.setNombre("Chocolate Cookies");
        ChocoCookies.setDescription("Cookies with chocolate chips");
        ChocoCookies.setUsers(juan);

        recipeRepository.save(ChocoCookies);

        Recipe maniSoup = new Recipe();
        maniSoup.setNombre("mani's soup");
        maniSoup.setDescription("soup of mani  wth potatoes");
        maniSoup.setUsers(juan);

        recipeRepository.save(maniSoup);
    }
}
