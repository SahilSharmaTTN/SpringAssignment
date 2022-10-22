package com.sahil.SpringAssignment.Question4;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void displayDetails(Users user){
        System.out.println(user.toString());

    }

}
