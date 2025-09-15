package Entities;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        Random estrazione = new Random(1);

        int[] numbers = new int[]{
                estrazione.nextInt(10),
                estrazione.nextInt(10),
                estrazione.nextInt(10),
                estrazione.nextInt(10),
                estrazione.nextInt(10)
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Array attuale: " + Arrays.toString(numbers));

            int newnumber;
            // Lettura numero con try-catch
            try {
                System.out.println("Numero da aggiungere in un array:");
                newnumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Errore: input non valido!");
                continue;
            }

            int position;
            try {
                System.out.println("Scegli la posizione (1-5), 0 per uscire:");
                position = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Errore: input non valido!");
                continue;
            }

            if (position == 0) {
                System.out.println("Uscita dal programma.");
                break;
            }

            if (position < 1 || position > 5) {
                System.out.println("Errore: posizione non valida!");
                continue;
            }


            numbers[position - 1] = newnumber;
        }
    }
}