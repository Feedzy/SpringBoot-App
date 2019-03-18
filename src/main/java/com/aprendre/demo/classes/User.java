package com.aprendre.demo.classes;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String names;

    private String email;

    public User() {
    }

    public Long getId() {
        return id;
    }
    public String getNames() {
        return names;
    }

    public void setNames(String name) {
        this.names = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
