package Exceptions;

public class CantBeZeroException extends RuntimeException {
    //attributi


    // costruttore
    public CantBeZeroException(int zero) {
        super("non puoi dividere per zero!" + zero);
    }
}
