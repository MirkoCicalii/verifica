/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escompito;

/**
 *
 * @author informatica
 */
public class Bagno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Semaforo pieno = new Semaforo(1);
        Semaforo vuoto = new Semaforo(1);
        Uomo u = new Uomo(pieno);
        Donna d = new Donna(vuoto);
        Persone Mirko = new Persone(pieno, vuoto, u, d);
        Persone Simo = new Persone(pieno, vuoto, u, d);
        Persone Tommaso = new Persone(pieno, vuoto, u, d);
        Persone Caterina = new Persone(pieno, vuoto, u, d);

        Mirko.start();
        Simo.start();
        Tommaso.start();
        Caterina.start();

    }

}
