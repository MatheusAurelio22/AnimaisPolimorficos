package org.example;

public class Aves extends Animal{

    public void locomover(){
        System.out.println("Esta ave está se locomovendo");
    }

    public void emitirSom(){
        System.out.println("Esta ave está emitindo som");
    }

    public void locomover(int velocidade){
        System.out.println("Esta ave está se movendo na velocidade: "+ velocidade+ " Km/h");
    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Esta ave está se movendo na velocidade: "+ velocidade+ " Km/h "+ "no terreno: "+ terreno);
    }
}
