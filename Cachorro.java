package org.example;

public class Cachorro extends Mamifero{
    public void locomover(){
        System.out.println("Estou andando");
    }

    public void emitirSom(){
        System.out.println("Estou latindo");
    }
    public void locomover(int velocidade){
        System.out.println("Essa Raça consegue chegar à "+ velocidade + " kilômetros por hora");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Estou indo na "+ velocidade+ " em "+ terreno);
    }
}
