package com.company;

public class Raichu extends Pokemon{

    public Raichu(String nuevoNombre,int nuevaVida){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = nuevaVida;
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Raichuuuu";
    }
}
