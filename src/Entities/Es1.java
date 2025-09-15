package Entities;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        Random estrazione = new Random(1);


        int ncasuale = estrazione.nextInt(10);
        int ncasuale1 = estrazione.nextInt(10);
        int ncasuale2 = estrazione.nextInt(10);
        int ncasuale3 = estrazione.nextInt(10);
        int ncasuale4 = estrazione.nextInt(10);

        int[] Arraynumbers = new int[]{0, 1, 2, 3, 4};
        int[] numbers = new int[]{ncasuale, ncasuale1, ncasuale2, ncasuale3, ncasuale4};

        System.out.println(Arrays.toString(numbers));
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("numero da aggiungere in un array");
            int newnumber = scanner.nextInt();

            System.out.println("scegli la posizione 1,2,3,4,5  0 per uscire");
            int position = scanner.nextInt();

            switch (position) {
                case 1 -> {
                    if (position == 1) {
                        numbers[position - 1] = newnumber;
                        System.out.println(Arrays.toString(numbers));

                    }
                }
                case 2 -> {
                    if (position == 2) {
                        numbers[position - 1] = newnumber;
                        System.out.println(Arrays.toString(numbers));
                    }
                }
                case 3 -> {
                    if (position == 3) {
                        numbers[position - 1] = newnumber;
                        System.out.println(Arrays.toString(numbers));
                    }
                }
                case 4 -> {
                    if (position == 4) {
                        numbers[position - 1] = newnumber;
                        System.out.println(Arrays.toString(numbers));
                    }
                }
                case 5 -> {
                    if (position == 5) {
                        numbers[position - 1] = newnumber;
                        System.out.println(Arrays.toString(numbers));
                    }
                }
                case 6 -> {
                    if (position == 0) {
                        return;
                    }
                }


            }


        }


    }
}