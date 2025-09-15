package Entities;

import Exceptions.CantBeZeroException;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanti kilometri hai percorso");

        int km = scanner.nextInt();
        System.out.println("quanti litri hai utilizzato?");

        int lt = scanner.nextInt();
        if (lt == 0) {
            throw new CantBeZeroException(0);
        }

        calckmlitri(km, lt);
    }

    public static void calckmlitri(int kilometri, int litri) {
        System.out.println("hai usato " + " " + kilometri / litri + "litri x kilometro");
    }

}
