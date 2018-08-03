package com.test.recipes.repository;

import org.springframework.data.repository.CrudRepository;
import com.test.recipes.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
}
