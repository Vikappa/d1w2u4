package org.example.classiEsercizi;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);
    private static Scanner scanner = new Scanner(System.in);

    public static void esegui() {
        double var1 = 0;
        double var2 = 0;

        var1 = question1(scanner);
        var2 = question2(scanner);

        calcolaPrezzo(var1, var2, scanner);
    }

    private static void calcolaPrezzo(double var1, double var2, Scanner scanner) {
        double prezzoFinale = 0;

        try{
            prezzoFinale = var1*var2;
            logger.info("Prezzo finale:" + prezzoFinale);
        } catch (Error e){
            logger.error(String.valueOf(e));
        }
    }

    private static double question1(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("Inserisci la distanza:");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                logger.error("Input non valido, inserisci un numero.");
                scanner.next();
            }
            catch (Error e){
                logger.error(String.valueOf(e));
                scanner.next();
            }
        }
    }

    private static double question2(Scanner scanner) {
        while (true) {
            logger.info("Inserisci il prezzo della benzina:");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                logger.error("Input non valido, inserisci un numero.");
                scanner.next();
            }
            catch (Error e){
                logger.error(String.valueOf(e));
                scanner.next();
            }
        }
    }

}
