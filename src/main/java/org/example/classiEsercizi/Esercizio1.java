package org.example.classiEsercizi;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1 {

    private static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void esecuzione(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

            int[] arrayEsercizio =  {random.nextInt(11), random.nextInt(11), random.nextInt(11), random.nextInt(11), random.nextInt(11)};
            int var1 = 0;
            int var2 = 0;

            for (int i = 0; i < arrayEsercizio.length; i++) {
                System.out.print(arrayEsercizio[i]);
                System.out.print(", ");
            }

                    var1 = question1(scanner);


           var2 = question2(scanner);



            addVar( var1, var2, arrayEsercizio, scanner);
        scanner.close();


scanner.close();

    }

    private static void addVar( int var1, int var2, int[] arrayEsercizio, Scanner scanner) {
        while (true){
            try{
                arrayEsercizio[var2] = var1;
                logger.info("Nuovo array");
                for (int i = 0; i < arrayEsercizio.length; i++) {
                    System.out.print(arrayEsercizio[i]);
                    System.out.print(", ");
                }
                scanner.close();
                break;
            }
            catch (ArrayIndexOutOfBoundsException ae) {
                logger.info("Errore nell'esecuzione del codice, nuovo indice non valido, ripeto sequenza aquisizione indice");
                var2 = question2(scanner);
            }
            catch (Error e){
                logger.error(String.valueOf(e));
            }
        }
    }

    private static int question2(Scanner scanner) {
        int choosen = 0;
        while (true) {
            System.out.println("Inserisci la posizione:");
            try {
                choosen = scanner.nextInt();
        return choosen;
            } catch (InputMismatchException me) {
                logger.error("Input non valido. Si prega di inserire un numero intero.", me);
                scanner.next();
            }
            catch (Error e){
                logger.error("Input non valido", e);
                scanner.next();
            }
        }
    }

    private static int question1(Scanner scanner) {
        int choosen = 0;
        while (true) {
            System.out.println("Inserisci un nuovo numero:");
            try {
                choosen = scanner.nextInt();
                return choosen;
            } catch (InputMismatchException me) {
                logger.error("Input non valido. Si prega di inserire un numero intero.", me);
                scanner.next();
            }
            catch (Error e){
                logger.error("Input non valido", e);
                scanner.next();
            }
        }
    }

}
