package org.example;

public class Cobra extends Reptil{
    public void locomover(){
        System.out.println("Esta cobra está rastejando");
    }

    public void emitirSom(){
        System.out.println("Esta cobra está sibilando");
    }
    public void locomover(int velocidade){
        System.out.println("Esta cobra consegue chegar à: "+ velocidade + " Km/h");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Esta cobra consegue chegar à: "+ velocidade + " Km/h "+ "no terreno: "+ terreno);
    }
}
