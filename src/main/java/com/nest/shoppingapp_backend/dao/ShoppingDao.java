package com.nest.shoppingapp_backend.dao;

import com.nest.shoppingapp_backend.model.Shopping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShoppingDao extends CrudRepository<Shopping,Integer>{
    @Query(value = "SELECT `id`, `category`, `description`, `name`, `price` FROM `shopping` WHERE `name` LIKE %:name",nativeQuery = true)
    List<Shopping> searchProduct(@Param("name") String name);


}
