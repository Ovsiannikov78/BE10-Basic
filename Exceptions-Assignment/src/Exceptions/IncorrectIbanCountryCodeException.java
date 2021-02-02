package Exceptions;

public class IncorrectIbanCountryCodeException extends Exception {
    public IncorrectIbanCountryCodeException(String message) {
        super(message);
    }
}
