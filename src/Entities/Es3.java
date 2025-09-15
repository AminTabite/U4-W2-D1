package Entities;

import Exceptions.BancaException;

public class Es3 {
    public static void main(String[] args) throws BancaException {

        ContoCorrente mioconto = new ContoCorrente("Amin", 150);
        ContoOnLine miocontonline = new ContoOnLine("Amin", 150, 30);


        mioconto.preleva(50);

        mioconto.restituisciSaldo();
        

    }
}
