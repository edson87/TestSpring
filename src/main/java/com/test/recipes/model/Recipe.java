package com.test.recipes.model;

import javax.persistence.*;

@Entity
public class Recipe extends ModelBase {
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Users users;
    private String description;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
