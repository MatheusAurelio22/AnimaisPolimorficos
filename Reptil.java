package org.example;

public class Reptil extends Animal{

    public void locomover(){
        System.out.println("Estou me locomovendo");
    }

    public void emitirSom(){
        System.out.println("Estou gritando");
    }
    public void locomover(int velocidade){
        System.out.println("Estou me movendo na velocidade "+ velocidade);
    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Estou indo na "+ velocidade+ " em "+ terreno);
    }
}
