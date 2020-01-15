package com.dovelol.dubboprovider.entity;

import java.io.Serializable;

/**
 * @author Dovelol
 * @date 2020/1/13 22:38
 */
public class User implements Serializable{


    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
