package com.company;

public class Wartortle extends Pokemon{

    public Wartortle(String nuevoNombre, int nuevaVida){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = nuevaVida;
    }


    @Override
    public Pokemon evolucionar() {
        return new Blastoise(this.nombre, this.vida);
    }

    @Override
    public String gritar() {
        return "Wartortleee";
    }
}
