package org.example;

public class Cachorro extends Mamifero{
    public void locomover(){
        System.out.println("Estou andando");
    }

    public void emitirSom(){
        System.out.println("Estou latindo");
    }
    public int locomover(int velocidade){
        return velocidade;
    }
    public String locomover(String terreno){
        return terreno;
    }
}
