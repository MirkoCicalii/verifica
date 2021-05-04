/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escompito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Persone extends Thread {

    Semaforo pieno;
    Semaforo vuoto;
    Uomo u;
    Donna d;

    public Persone(Semaforo pieno, Semaforo vuoto, Uomo u, Donna d) {  // costruttore
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.u = u;
        this.d = d;
    }

    public void run() {

        try {
            u.EntraBagno();  // fa partire il metodo EntraBagno in Uomo
            d.EntraBagno();  // fa partire il metodo EntraBagno in Donna
            u.EsciBagno();   // fa partire il metodo EsciBagno in Uomo
            d.EsciBagno();   // fa partire il metodo EsciBagno in Donna
        } catch (InterruptedException ex) {
            Logger.getLogger(Persone.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
