package com.company;

public class Pikachu extends Pokemon{

    public Pikachu(String nuevoNombre){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = 100;
    }


    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Pikaaa Pikaa";
    }
}
