package com.example.dep3.controllers;

import com.example.dep3.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "")
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(MyService myService){

        this.myService = myService;
    }

    @GetMapping(value = "/getName")
    public String getNameController(){

        return myService.getName();
    }

    @GetMapping(value = "")
    public String wellcome(){

        return "wellcome!";
    }
}