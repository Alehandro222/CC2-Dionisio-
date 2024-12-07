// Dionisio
import javax.swing.*;
import javax.swing.JOptionPane;
public class finalchallenge5b {
    public static void main(String[] asd){
        String input;
        // Calling on another class (InvalidQuantityException)
        Orderprocess processor = new Orderprocess();
        // Welcome Message
        JOptionPane.showMessageDialog(null, "Welcome to ChickenBurg Online Shopping Mart! Do you want to make an order?", "Welcome!", JOptionPane.INFORMATION_MESSAGE);
        // Amount of items that will be ordered
        input = JOptionPane.showInputDialog(null, "How many are you ordering?", "Order:");
        // Showing how much was ordered
        try {
            // Parse the input to an integer and process the order
            int quantity = Integer.parseInt(input);
            // This will throw InvalidQuantityException if quantity is invalid
            processor.processOrder(quantity);
            JOptionPane.showMessageDialog(null, "You have ordered " + input + " items.");
        } catch (InvalidQuantityException e) {
            // Case where an invalid quantity is entered
            JOptionPane.showMessageDialog(null, "You have ordered too much or have given an invalid input!", "Invalid Input!", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Case where the input is not a valid integer
            JOptionPane.showMessageDialog(null, "Please enter a valid number for the quantity.", "Invalid Input!", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}

