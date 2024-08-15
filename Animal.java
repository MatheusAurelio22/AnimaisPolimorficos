package org.example;

public abstract class Animal {

    public void locomover() {
        System.out.println(" Estou me locomovendo ");

    }

    public int locomover(int velocidade){
        return velocidade;
    }
    public String locomover(String terreno){
        return terreno;
    }

    public void emitirSom(){
        System.out.println("Estou emitindo som");

    }

}
