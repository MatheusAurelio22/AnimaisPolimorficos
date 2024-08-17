package org.example;

public class Cachorro extends Mamifero{
    public void locomover(){
        System.out.println("Esta raça está se locomovendo");
    }

    public void emitirSom(){
        System.out.println("Esta raça está latindo");
    }
    public void locomover(int velocidade){
        System.out.println("Essa Raça consegue chegar à: "+ velocidade + " Km/h");

    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Essa Raça consegue chegar à: "+ velocidade + " Km/h "+ "no terreno: "+ terreno);
    }
}
