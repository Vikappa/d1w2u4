package org.example.classiEsercizi;

public class Contocorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    Contocorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    void preleva(double x) {
if(nMovimenti< maxMovimenti) {
    saldo = saldo-x;
}else {
    saldo = saldo - x - 0.5;
}
    }
}