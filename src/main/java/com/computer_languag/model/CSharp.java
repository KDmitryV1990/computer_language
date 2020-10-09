package com.computer_languag.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CSharp extends ComputerLanguage{



    @Override
    public String toString() {
        return "C#{" +
                "username='" + getUsername() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}';
    }

}
