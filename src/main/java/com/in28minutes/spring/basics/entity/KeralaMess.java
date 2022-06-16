package com.in28minutes.spring.basics.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class KeralaMess implements IMessDetails{
    /*private String messName;
    private String messId;

    public String getMessName() {
        return messName;
    }

    public void setMessName(String messName) {
        this.messName = messName;
    }

    public String getMessId() {
        return messId;
    }

    public void setMessId(String messId) {
        this.messId = messId;
    }

    public MessDetails(String messName, String messId) {
        this.messName = messName;
        this.messId = messId;
    }

    @Override
    public String toString() {
        return "MessDetails{" +
                "messName='" + messName + '\'' +
                ", messId='" + messId + '\'' +
                '}';
    }*/
    public void getDetails(){
        System.out.println("Kerala Mess");
    }
}
