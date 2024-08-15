package org.example;

public class Aves extends Animal{

    public void locomover(){
        System.out.println("Estou me locomovendo");
    }

    public void emitirSom(){
        System.out.println("Estou gritando");
    }

    public int locomover(int velocidade){
        return velocidade;
    }
    public String locomover(String terreno){
        return terreno;
    }
}
