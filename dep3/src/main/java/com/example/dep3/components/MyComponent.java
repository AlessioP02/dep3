package com.example.dep3.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){

        this.myComponentName = "Alessio";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}

