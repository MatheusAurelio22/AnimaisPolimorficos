package org.example;

public class Pardal extends Aves{
    public void locomover(){
        System.out.println(" Estou voando ");
    }

    public void emitirSom(){
        System.out.println("Estou cantando");
    }
    public void locomover(int velocidade) {
        System.out.println("Essa ave voa à " + velocidade + " Kilômetros por hora");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Estou indo na "+ velocidade+ " em "+ terreno);
    }
}
