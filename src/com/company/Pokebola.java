package com.company;

public class Pokebola {
    private String escala ;
    private Pokemon pokemon;

    public Pokebola(String nuevaEscala){
        this.escala = nuevaEscala;
        this.pokemon = null;
    }

    public Pokemon getPokemon() {
         return this.pokemon;
    }

    public String getEscala() {
         return this.escala;
    }

    public void  setPokemon(Pokemon nuevoPokemon){
        this.pokemon = nuevoPokemon;
    }

}
