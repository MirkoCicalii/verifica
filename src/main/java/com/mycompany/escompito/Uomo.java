/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escompito;

import static java.lang.Thread.sleep;

/**
 *
 * @author informatica
 */
public class Uomo {

    Semaforo pieno;

    public Uomo(Semaforo pieno) {  //Costruttore
        this.pieno = pieno;
    }

    public void EntraBagno() throws InterruptedException {  //Manda un eccezzione
        pieno.P();  //lo mette in attesa e lo avvia
        System.out.println("Un uomo è entrato in bagno ");
        sleep(5000);
    }

    public void EsciBagno() {
        pieno.V(); // lo rilascia
        System.out.println("Un uomo è uscito dal bagno ");
    }

}
