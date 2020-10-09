package com.computer_languag.model;

import org.springframework.stereotype.Component;

@Component
public class SeePlusPlus extends ComputerLanguage{

    @Override
    public String toString() {
        return "C++{" +
                "username='" + getUsername() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}';
    }
}
