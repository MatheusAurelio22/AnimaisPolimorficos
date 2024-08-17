package org.example;


public class Main {
    public static void main(String[] args) {

    // Classes Secundárias
        Animal aves = new Aves();
        aves.locomover();
        aves.emitirSom();
        aves.locomover(30);
        aves.locomover(30,"acima de 2000 pés");

        Animal mamiferos = new Mamifero();
        mamiferos.locomover();
        mamiferos.emitirSom();
        mamiferos.locomover(30);
        mamiferos.locomover(30,"Savana");

        Animal reptil = new Reptil();
        reptil.locomover();
        reptil.emitirSom();
        reptil.locomover(20);
        reptil.locomover(20,"Pantano");

    // Classes Terceárias
        Animal cachorro = new Cachorro();
        cachorro.locomover();
        cachorro.emitirSom();
        cachorro.locomover(48);
        cachorro.locomover(48,"grama");

        Animal pato = new Pato();
        pato.locomover();
        pato.emitirSom();
        pato.locomover(90);
        pato.locomover(90,"6 mil metros");

        Animal pardal = new Pardal();
        pardal.locomover();
        pardal.emitirSom();
        pardal.locomover(46);
        pardal.locomover(46,"Céu limpo");

        Animal gato = new Gato();
        gato.locomover();
        gato.emitirSom();
        gato.locomover(48);
        gato.locomover(48,"terreno plano");

        Animal tartaruga = new Tartaruga();
        tartaruga.locomover();
        tartaruga.emitirSom();
        tartaruga.locomover(35);
        tartaruga.locomover(35,"oceano");

        Animal cobra = new Cobra();
        cobra.locomover();
        cobra.emitirSom();
        cobra.locomover(28);
        cobra.locomover(28,"desértico");






    }
}
