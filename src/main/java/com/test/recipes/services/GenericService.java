package com.test.recipes.services;

import java.util.List;

public interface GenericService<T> {
   List<T> findAll();
   T findById(Long id);
   T save(T model);
   void delete(Long id);
}
