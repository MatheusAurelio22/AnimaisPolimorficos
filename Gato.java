package org.example;

public class Gato extends Mamifero{

    public void locomover(){
        System.out.println("Este Gato está se locomovendo");
    }

    public void emitirSom(){
        System.out.println("Este Gato está miando");
    }
    public void locomover(int velocidade){
        System.out.println("Este Gato consegue voar à: "+ velocidade + " Km/h");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Este Gato consegue chegar à: "+ velocidade + " Km/h "+ "no terreno: "+ terreno);
    }
}
