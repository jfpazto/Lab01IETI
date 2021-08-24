package com.escuelaing.edu.co.Lab01.dto;
//Objeto de transferencia entre el cliente y el servidor u objeto POJO, trae informacion de multiples tablas, solo lectura, nada de operaciones de negocio

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String name;
    private String email;
    private String lastName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




}
