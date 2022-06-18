package com.in28minutes.spring.basics.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BTech")
public class BTech implements ICourse{

    public BTech() {
    }

    @Autowired
    public Department department;
    @Override
    public String getCourseName() {
        System.out.println("BTech");
        return name;
    }
}
