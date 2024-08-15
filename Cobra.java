package org.example;

public class Cobra extends Reptil{
    public void locomover(){
        System.out.println("Estou Rastejando");
    }

    public void emitirSom(){
        System.out.println("Estou chocalhando");
    }
    public int locomover(int velocidade){
        return velocidade;
    }
    public String locomover(String terreno){
        return terreno;
    }
}
