package org.example;

public class Mamifero extends Animal {

    public void locomover(){
        System.out.println("Esta mamífero está se locomovendo");
    }

    public void emitirSom(){
        System.out.println("Este mamífero está emitindo som");
    }
    public void locomover(int velocidade){
        System.out.println("Este mamífero está se movendo na velocidade: "+ velocidade+ " Km/h");
    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Este mamífero está se movendo na velocidade: "+ velocidade+ " Km/h "+ "no terreno: "+ terreno);

    }

}
