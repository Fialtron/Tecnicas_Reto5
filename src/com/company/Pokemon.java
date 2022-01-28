package com.company;

public abstract class Pokemon {

    protected int vida ;
    protected byte nivel;
    protected String nombre;

    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();
    
}