import javax.swing.*;

public class Orderprocess {

    public void processOrder(int quantity) throws InvalidQuantityException {
        // Check if the quantity is valid (must be greater than zero)
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than zero");
            } else if (quantity > 20){
            throw new InvalidQuantityException("Quantity must not exceed 20 items");
        }
    }
}

