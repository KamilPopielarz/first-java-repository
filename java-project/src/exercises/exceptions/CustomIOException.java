package exercises.exceptions;

import java.io.IOException;

public class CustomIOException extends RuntimeException {
    public CustomIOException(String message) {
        super(message);
        System.out.println("Throwing custom IO exception");
    }
}
