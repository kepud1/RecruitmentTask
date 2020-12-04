package pierce.task.exceptions;

public class AttributeNotFoundException extends RuntimeException {
    public AttributeNotFoundException(String code) {
       super("Could not find attribute with that code: " + code);
    }
}
