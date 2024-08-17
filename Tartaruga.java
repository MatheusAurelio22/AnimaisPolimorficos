package org.example;

public class Tartaruga extends Reptil{

    public void locomover(){
        System.out.println("Esta Tartaruga está se locomovendo");
    }

    public void emitirSom(){
        System.out.println("Esta Tartaruga está Grunhindo");
    }
    public void locomover(int velocidade){
        System.out.println("Esta Tartaruga consegue anda no máximo à: "+ velocidade + " Km/h");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Esta Tartaruga consegue chegar no máximo à: "+ velocidade + " Km/h "+ "no terreno: "+ terreno);
    }
}
