package edu.blitstein.exception;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative Number Exception!");
    }


    public NegativeNumberException(String message) {
        super(message);
    }
}