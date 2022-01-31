package com.company;

public class Charmeleon extends Pokemon{

    public Charmeleon(String nuevoNombre, int nuevaVida){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = nuevaVida;
    }


    @Override
    public Pokemon evolucionar() {
        return new Charizard(this.nombre,this.vida);
    }

    @Override
    public String gritar() {
        return "Chaaaarrrmeeeleeeeooonnn";
    }
}
