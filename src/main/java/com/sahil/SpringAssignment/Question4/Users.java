package com.sahil.SpringAssignment.Question4;

import org.springframework.stereotype.Component;

@Component
public class Users {

    private Integer id;
    private String name;
    private String competency;
    private Integer age;

    public Users(Integer id, String name, String competency, Integer age) {
        this.id = id;
        this.name = name;
        this.competency = competency;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
