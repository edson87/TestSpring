package com.test.recipes.services;

import com.test.recipes.model.Users;
import org.springframework.data.repository.CrudRepository;

public class UsersServiceImpl extends GenericServiceImpl<Users> implements UsersService {

    @Override
    protected CrudRepository<Users, Long> getRepository() {
        return null;
    }
}
