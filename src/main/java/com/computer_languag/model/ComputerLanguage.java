package com.computer_languag.model;

import javax.persistence.*;

@Entity
@Table(name = "ComputerLanguage")
public class ComputerLanguage {

    public ComputerLanguage(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String username;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private Integer rating;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
