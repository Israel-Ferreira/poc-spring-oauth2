package com.ecquiti.pocspringoauth2.exceptions;


public class CarNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CarNotFoundException(){
        super("Carro não encontrado");
    }

    public CarNotFoundException(String message) {
        super(message);
    }

    public CarNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    
}
