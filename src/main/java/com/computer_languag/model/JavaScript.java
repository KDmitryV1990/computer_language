package com.computer_languag.model;

import org.springframework.stereotype.Component;

@Component
public class JavaScript extends ComputerLanguage{


    @Override
    public String toString() {
        return "JavaScript{" +
                "username='" + getUsername() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}';
    }

}


