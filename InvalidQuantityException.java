
public class InvalidQuantityException extends Exception {
    // Constructor with a custom message
    public InvalidQuantityException(String message) {
        super(message);  // Pass the message to the Exception class
    }

    // Constructor with no message, default message will be used
    public InvalidQuantityException() {
        super("Quantity is invalid");
    }
}
