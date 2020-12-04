package pierce.task.exceptions;

public class OptionNotFoundException extends RuntimeException {
    public OptionNotFoundException(String code) {
       super("Could not find option with that code: " + code);
    }
}
