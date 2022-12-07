package com.nest.shoppingapp_backend.controller;

import com.nest.shoppingapp_backend.dao.ShoppingDao;
import com.nest.shoppingapp_backend.model.Shopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    public ShoppingDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage()
    {
        return "Home page shopping cart";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Shopping s)
    {
        dao.save(s);
        return ("Product added");
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shopping> ViewProduct()
    {
        return (List<Shopping>) dao.findAll();
    }
}
