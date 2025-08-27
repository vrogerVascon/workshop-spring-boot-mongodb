package com.roger.spring_mongo.dto;

import java.io.Serializable;
import com.roger.spring_mongo.domain.User;

public class AuthorDTO implements Serializable {
    private String id;
    private String name;

    public AuthorDTO() {}

    public AuthorDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}


