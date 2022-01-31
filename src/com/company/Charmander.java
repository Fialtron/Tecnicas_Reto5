package com.company;

public class Charmander extends Pokemon {

    public Charmander(String nuevoNombre){
        this.nivel = 1;
        this.nombre = nuevoNombre;
        this.vida = 100;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getVida(){
        return this.vida;
    }


    @Override
    public Pokemon evolucionar() {
        return new Charmeleon(this.nombre,this.vida);
    }

    @Override
    public String gritar() {
        return "Chaaaarmaaaandeerrrr";
    }
}