package org.example;

public class Passaros extends Aves{
    public void locomover(){
        System.out.println(" Estou voando ");
    }

    public void emitirSom(){
        System.out.println("Estou cantando");
    }
    public int locomover(int velocidade){
        return velocidade;
    }
    public String locomover(String terreno){
        return terreno;
    }
}
