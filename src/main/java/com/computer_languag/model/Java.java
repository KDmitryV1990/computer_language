package com.computer_languag.model;

import org.springframework.stereotype.Component;

@Component
public class Java extends ComputerLanguage{
    @Override
    public String toString() {
        return "Java{" +
                "username='" + getUsername() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", rating=" + getRating() +
                '}';
}
}