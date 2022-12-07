package com.nest.shoppingapp_backend.dao;

import com.nest.shoppingapp_backend.model.Shopping;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingDao extends CrudRepository<Shopping,Integer>{
}
