package com.company;

public class Pikachu extends Pokemon{

    public Pikachu(String nuevoNombre){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = 100;
    }


    @Override
    public Pokemon evolucionar() {
        return new Raichu(this.nombre, this.vida);
    }

    @Override
    public String gritar() {
        return "Pikaaa Pikaa";
    }
}
