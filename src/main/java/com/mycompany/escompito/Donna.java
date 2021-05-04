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
public class Donna {

    Semaforo vuoto;

    public Donna(Semaforo vuoto) {  //Costruttore
        this.vuoto = vuoto;
    }

    public void EntraBagno() throws InterruptedException {  //Manda un eccezzione 
        vuoto.P();  //lo mette in attesa e lo avvia
        System.out.println("Una donna è entrata in bagno");
        sleep(5000);
    }

    public void EsciBagno() {
        vuoto.V();  // lo rilascia
        System.out.println("Una donna è uscita dal bagno");
    }
}
