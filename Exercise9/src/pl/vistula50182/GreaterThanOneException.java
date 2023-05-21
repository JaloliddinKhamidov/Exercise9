package pl.vistula50182;


public class GreaterThanOneException extends Exception {
    public GreaterThanOneException(String errorMessage) {
        super(errorMessage);
    }
}