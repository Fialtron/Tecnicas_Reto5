package com.company;

import java.util.*;

public class Menu {
    boolean exit = false;
    int option;
    int nRegistros;
    List<Pokebola> pokebolas = new ArrayList<>();
    List<Pokemon> pokemons = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public Menu() {
        this.menu();
    }

    private void menu() {
        while (!exit) {
            System.out.print("\nMenu \n 1. Crear pokemon \n " +
                    "2. Crear pokebola \n " +
                    "3. Guardar pokemon \n " +
                    "4. Gritos de pokemon \n " +
                    "5. Evolucionar pokemon  \n " +
                    "6. Sacar pokemon \n " +
                    "7. Salir \n");
            System.out.print("Ingrese una opcion: ");
            try {
                option = Integer.parseInt(sc.next());
                switch (option) {
                    case 1:
                        crearPokemon();
                        break;
                    case 2:
                        crearPokebolas();
                        break;
                    case 3:
                        if (pokebolas.size() != 0) {

                            for (int i = 0; i < pokemons.size(); i++) {
                                System.out.print("\n" + i + "." + " Tipo: " + pokemons.get(i).getClass().getSimpleName()
                                        + " Nombre: " + pokemons.get(i).nombre);
                            }
                            guardarPokemon();

                            for (int i = 0; i < pokemons.size(); i++) {
                                System.out.print("\n" + i + "." + " Tipo: " + pokemons.get(i).getClass().getSimpleName()
                                        + " Nombre: " + pokemons.get(i).nombre);
                            }
                        } else {
                            System.out.print("Debe tener pokebolas para usar esta opción ");
                        }
                        break;
                    case 4:
                        gritosPokemon();
                        break;
                    case 5:

                        break;
                    case 6:
                        for (int i = 0; i < pokemons.size(); i++) {
                            System.out.print("\n" + i + "." + " Tipo: " + pokemons.get(i).getClass().getSimpleName()
                                    + " Nombre: " + pokemons.get(i).nombre);
                        }
                        sacarPokemon();

                        for (int i = 0; i < pokemons.size(); i++) {
                            System.out.print("\n" + i + "." + " Tipo: " + pokemons.get(i).getClass().getSimpleName()
                                    + " Nombre: " + pokemons.get(i).nombre);
                        }
                        break;
                    case 7:
                        System.out.print("Hasta luego!");
                        exit = true;
                        break;
                    default:
                        System.out.print("Opcion no valida!\n\n");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Inserte un numero valido. Por favor intente nuevamente");
            }
        }
    }

    private void crearPokebolas() {

        System.out.print("Ingrese el numero de pokebolas que desea crear: ");

        try {
            String number = sc.next();

            while (!validate(number)) {
                System.out.println("Por favor ingrese un numero valido");
                System.out.print("Ingrese el numero de pokebolas que desea crear: ");
                number = sc.next();
            }

            nRegistros = Integer.parseInt(number);

            if (nRegistros > 0) {

                for (int i = 0; i < nRegistros; i++) {

                    int opcion = 0;

                    try {
                        System.out.print(" \nSeleccione el tamaño de la pokebola que desea : ");
                        System.out.print(" \n1. Pequeña : ");
                        System.out.print(" \n2. Mediana : ");
                        System.out.print(" \n3. Grande : ");
                        System.out.print("\nIngrese opción: ");
                        opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                pokebolas.add(new Pokebola("Pequeña"));
                                break;
                            case 2:

                                pokebolas.add(new Pokebola("Mediana"));
                                break;
                            case 3:
                                pokebolas.add(new Pokebola("Grande"));
                                break;
                            default:
                                System.out.println("\n Ingrese una opcion valida\n\n");
                                break;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println(
                                "\n No ha ingresado la informacion correctamente. Por favor intente nuevamente\n\n");
                    }
                }
                System.out.println("\n Sus pokebolas ahora son:" + pokebolas.size() + "\n\n");
            } else {
                System.out.println("Inserte un numero mayor a 0. Por favor intente nuevamente\n\n");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Inserte un numero valido. Por favor intente nuevamente\n\n");
        }

    }

    private void crearPokemon() {
        System.out.print("Ingrese el numero de pokemons que desea crear: ");

        try {
            String number = sc.next();

            while (!validate(number)) {
                System.out.println("Por favor ingrese un numero valido");
                System.out.print("Ingrese el numero de pokemons que desea crear: ");
                number = sc.next();
            }

            nRegistros = Integer.parseInt(number);

            if (nRegistros > 0) {

                for (int i = 0; i < nRegistros; i++) {

                    int opcion = 0;
                    String pokeNombre = null;

                    try {
                        System.out.print(" \nSeleccione el tipo de pokemon que desea : ");
                        System.out.print(" \n1. Pikachu : ");
                        System.out.print(" \n2. Squirtle : ");
                        System.out.print(" \n3. Charmander : ");
                        System.out.print("\nIngrese opción: ");

                        opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.print(" \nDigite el nombre de su nuevo pokemon : ");
                                pokeNombre = sc.next();
                                pokemons.add(new Pikachu(pokeNombre));
                                break;
                            case 2:
                                System.out.print(" \nDigite el nombre de su nuevo pokemon : ");
                                pokeNombre = sc.next();
                                pokemons.add(new Squirtle(pokeNombre));
                                break;
                            case 3:
                                System.out.print(" \nDigite el nombre de su nuevo pokemon : ");
                                pokeNombre = sc.next();
                                pokemons.add(new Charmander(pokeNombre));
                                break;
                            default:
                                System.out.println("\n Ingrese una opcion valida\n\n");
                                break;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println(
                                "\n No ha ingresado la informacion correctamente. Por favor intente nuevamente\n\n");
                    }
                }
                System.out.println("\n Ahora tiene: " + pokemons.size() + " pokemons \n\n");
            } else {
                System.out.println("Inserte un numero mayor a 0. Por favor intente nuevamente\n\n");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Inserte un numero valido. Por favor intente nuevamente\n\n");
        }

    }

    private void guardarPokemon() {

        System.out.print("\nSeleccione el numero de la pokebola que desea utilizar: ");

        try {

            for (int i = 0; i < pokebolas.size(); i++) {
                if (pokebolas.get(i).getPokemon() == null) {
                    System.out.print("\n" + i + "." + " Tamaño: " + pokebolas.get(i).getEscala());
                }
            }

            System.out.print("\nIngrese opción : ");
            int bolaOpcion = sc.nextInt();

            System.out.print("\nSeleccione el numero del pokemon que desea utilizar: ");

            for (int i = 0; i < pokemons.size(); i++) {
                System.out.print("\n" + i + "." + " Tipo: " + pokemons.get(i).getClass().getSimpleName() + " Nombre: "
                        + pokemons.get(i).nombre);
            }

            System.out.print("\nIngrese opción : ");
            int pokeOpcion = sc.nextInt();

            pokebolas.get(bolaOpcion).setPokemon(pokemons.get(pokeOpcion));
            pokemons.remove(pokeOpcion);

        } catch (NumberFormatException ex) {
            System.out.println("Inserte un numero valido. Por favor intente nuevamente\n\n");
        }

    }

    private void gritosPokemon() {
        System.out.println("\nCada uno de los pokemons por fuera de pokebolas van a gritar");

        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println("\nTipo: " + pokemons.get(i).getClass().getSimpleName() + " Nombre: "
                    + pokemons.get(i).nombre + " Grito: " + pokemons.get(i).gritar());
        }

    }

    private void sacarPokemon() {

        System.out.print("\nSeleccione el pokemon que desea sacar: ");

        try {

            for (int i = 0; i < pokebolas.size(); i++) {
                if (pokebolas.get(i).getPokemon() != null) {
                    System.out.print("\n" + i + "." + " Pokebola: " + pokebolas.get(i).getEscala());
                    System.out.print("\n---Nombre: " + pokebolas.get(i).getPokemon().nombre + " Tipo: "
                            + pokebolas.get(i).getPokemon().getClass().getSimpleName());
                }
            }

            System.out.print("\nIngrese opción : ");
            int pokeOpcion = sc.nextInt();
            pokemons.add(pokebolas.get(pokeOpcion).getPokemon());
            pokebolas.get(pokeOpcion).setPokemon(null);

        } catch (NumberFormatException ex) {
            System.out.println("Inserte un numero valido. Por favor intente nuevamente\n\n");
        }

    }

    private boolean validate(String input) {
        return input.matches("[0-9]{1,13}(\\.[0-9]*)?");
    }
}
