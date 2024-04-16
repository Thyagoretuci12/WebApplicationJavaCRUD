package school.sptech.appweb.exceptions;

public class UserNotFoundException extends Throwable{
    public UserNotFoundException(String message) {
        super(message);
    }
}
