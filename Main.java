package org.example;


public class Main {
    public static void main(String[] args) {

        Animal galoDeCampina = new Pardal();
        Animal husky = new Cachorro();
        Animal coral = new Cobra();
        galoDeCampina.locomover(30);
        husky.locomover(30);
        coral.locomover(15);
        galoDeCampina.locomover(30,"Chuva");
        husky.locomover(30,"Neve");
        coral.locomover(15,"Grama alta");

    }
}
