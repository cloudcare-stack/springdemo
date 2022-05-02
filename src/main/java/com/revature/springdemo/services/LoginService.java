package com.revature.springdemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Spring Bean
@Component
public class LoginService {

    public boolean validateUser(String userid, String password){
        //colin, howie
        return userid.equalsIgnoreCase("colin")
                && password.equalsIgnoreCase("howie");
    }
}
