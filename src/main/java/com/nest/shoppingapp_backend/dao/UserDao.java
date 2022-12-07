package com.nest.shoppingapp_backend.dao;

import com.nest.shoppingapp_backend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {
}
