package com.company;

public class Blastoise extends Pokemon{
    public Blastoise(String nuevoNombre, int nuevaVida){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = nuevaVida;
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public String gritar() {
        return "Blasssstoooooiiiiiiiiseeee";
    }
}
