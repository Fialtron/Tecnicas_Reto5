package com.company;

public class Squirtle extends Pokemon{

    public Squirtle(String nuevoNombre){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = 100;
    }

    @Override
    public Pokemon evolucionar() {
        return new Wartortle(this.nombre, this.vida);
    }

    @Override
    public String gritar() {
        return "Squirtle";
    }
}
