package org.example;

public class Pardal extends Aves{
    public void locomover(){
        System.out.println("Este Pardal está voando");
    }

    public void emitirSom(){
        System.out.println("Este Pardal está cantando");
    }
    public void locomover(int velocidade) {
        System.out.println("Este Pardal consegue voar à: "+ velocidade + " Km/h");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Este Pardal consegue chegar à: "+ velocidade + " Km/h "+ "no terreno: "+ terreno);
    }
}
