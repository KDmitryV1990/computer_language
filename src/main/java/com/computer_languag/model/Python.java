package com.computer_languag.model;

import org.springframework.stereotype.Component;

@Component
public class Python extends ComputerLanguage{

    @Override
    public String toString() {
        return "Python{" +
                "username='" + getUsername() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}';
    }
}
