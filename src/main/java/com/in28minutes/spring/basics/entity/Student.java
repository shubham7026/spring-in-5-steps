package com.in28minutes.spring.basics.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Student {
   /* private String name;
    private long rollNo;*/
    @Autowired//wiring by name
    private IMessDetails keralaMess;

    @Autowired
    @Qualifier("BTech")//wiring by qualifier
    private ICourse course;

    /*public Student(IMessDetails messDetails) {
        this.studentMess = messDetails;
    }*/

    public void getDetails(){
        course.getCourseName();
        keralaMess.getDetails();
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public MessDetails getMessDetails() {
        return messDetails;
    }

    public void setMessDetails(MessDetails messDetails) {
        this.messDetails = messDetails;
    }

    public Student(String name, long rollNo, MessDetails messDetails) {
        this.name = name;
        this.rollNo = rollNo;
        this.messDetails = messDetails;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", messDetails=" + messDetails +
                '}';
    }*/
}
