package org.example;

public class Pato extends Aves{
    public void locomover(){
        System.out.println("Estou Rastejando");
    }

    public void emitirSom(){
        System.out.println("Estou chocalhando");
    }
    public void locomover(int velocidade){
        System.out.println("Essa espécie consegue chegar à "+ velocidade+ " Kilômetros por hora");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Estou indo na "+ velocidade+ " em "+ terreno);
    }


}
