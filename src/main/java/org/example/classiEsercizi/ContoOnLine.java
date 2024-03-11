package org.example.classiEsercizi;

public class ContoOnLine extends Contocorrente {
    double maxPrelievo;
    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo(){
        System.out.println();
    }
}