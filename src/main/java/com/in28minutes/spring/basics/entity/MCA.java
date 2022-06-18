package com.in28minutes.spring.basics.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MCA")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MCA implements ICourse{
    @Autowired
    public Semester semester;
    @Override
    public String getCourseName() {
        System.out.println("MCA");
        return name;
    }
}
