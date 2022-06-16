package com.in28minutes.spring.basics.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MCA")
public class MCA implements ICourse{
    @Override
    public String getCourseName() {
        System.out.println("MCA");
        return name;
    }
}
