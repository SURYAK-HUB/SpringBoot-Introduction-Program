package com.example.demo.model;

import org.springframework.boot.jackson.JsonComponent;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    public Person(@JsonComponent("id") UUID id,@JsonComponent("name") String name)
    {
        this.id=id;
        this.name=name;

    }
    public UUID getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

}
