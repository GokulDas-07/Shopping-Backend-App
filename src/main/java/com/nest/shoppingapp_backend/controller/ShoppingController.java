package com.nest.shoppingapp_backend.controller;

import com.nest.shoppingapp_backend.dao.ShoppingDao;
import com.nest.shoppingapp_backend.dao.UserDao;
import com.nest.shoppingapp_backend.model.Shopping;
import com.nest.shoppingapp_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    public ShoppingDao dao;
    @Autowired
    public UserDao daou;

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
    @PostMapping(path = "/user",consumes = "application/json",produces = "application/json")
    public String UserReg(@RequestBody User u)
    {
        daou.save(u);
        return ("User registered");
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shopping> ViewProduct()
    {
        return (List<Shopping>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Shopping> searchProduct(@RequestBody Shopping s)
    {
        String name=s.getName().toString();
        System.out.println(name);
        return (List<Shopping>) dao.searchProduct(s.getName());
    }
}
