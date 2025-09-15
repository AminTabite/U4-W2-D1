package Exceptions;

public class WrongNumber extends RuntimeException {
    //attrbuti

    //costruttore
    public WrongNumber(int wrongnumber) {
        super("il numero" + wrongnumber + " non e' incluso nelle scelte");
    }

    public WrongNumber(double wrongnumber) {
        super("il numero" + wrongnumber + " non e' incluso nelle scelte");
    }

    //metodi
}
