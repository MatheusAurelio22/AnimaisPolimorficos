package org.example;


public class Main {
    public static void main(String[] args) {

        Animal galoDeCampina = new Passaros();
        Animal husky = new Cachorro();
        Animal coral = new Cobra();
        System.out.println("Sou um Galo de Campina e voo à "+ galoDeCampina.locomover(30)+
                " Kilômetros por hora na "+ galoDeCampina.locomover("Chuva"));
        System.out.println("Sou um Husky e corro à "+ husky.locomover(40)+
                " Kilômetros por hora na "+ husky.locomover("Neve"));
        System.out.println("Sou uma coral e rastejo à "+ coral.locomover(15)+
                " Kilômetros por hora na "+ coral.locomover("Grama alta"));

    }
}