package Task3;

public class LimitException extends RuntimeException {
    public LimitException(final String message, final int attempts){
        super(message);


    }
}