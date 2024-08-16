package org.example;

public abstract class Animal {


    public void locomover() {
        System.out.println("Estou me locomovendo");

    }
    public void emitirSom(){
        System.out.println("Estou emitindo som");

    }

    public void locomover(int velocidade){
        System.out.println("Estou me movendo na velocidade "+ velocidade);
    }
    public void locomover(int velocidade, String terreno){
        System.out.println("Estou indo na "+ velocidade+ " em "+ terreno);
    }



}
