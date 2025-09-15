package Exceptions;

public class NotANumber extends RuntimeException {

    // attributi

    //costruttori
    public NotANumber(String notnum) {

        super(notnum + "non e' un numero!");
    }

    public NotANumber() {
    }
}
