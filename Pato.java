package org.example;

public class Pato extends Aves{
    public void locomover(){
        System.out.println("Este Pato está se locomovendo");
    }

    public void emitirSom(){
        System.out.println("Este Pato está grasnando");
    }
    public void locomover(int velocidade){
        System.out.println("Este Pato consegue chegar à: "+ velocidade + " Km/h");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Este Pato consegue chegar à: "+ velocidade + " Km/h "+ "no terreno: "+ terreno);
    }


}
