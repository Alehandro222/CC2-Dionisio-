// Dionisio
import javax.naming.InsufficientResourcesException;
import javax.swing.JOptionPane;
import java.util.*;
public class finalchallenge5 {
    public static void main(String[] asdf) throws InsufficientResourcesException {
        int  bankmoney = 50000, withdrawedmoney = 0; // Bank Money
        String name;
        // Welcoming Message.
        JOptionPane.showMessageDialog(null, "Welcome to Chickenburg International Bank!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
        // Name Input.
        name = JOptionPane.showInputDialog(null, "What is your name?", "Name: ");
        // Withdrawing money from the bank.
        int withdrawingmoney = JOptionPane.showConfirmDialog(null, "Welcome " + name + " Would you like to Withdraw?", "Withdraw", JOptionPane.YES_NO_OPTION);
        // If Yes or No.
        if (withdrawingmoney == JOptionPane.YES_OPTION) {
            try {
                withdrawedmoney = Integer.parseInt((JOptionPane.showInputDialog(null, "How much do you want to withdraw?", "Withdrawal:")));
                    if (withdrawedmoney > bankmoney) {
                        JOptionPane.showMessageDialog(null, "So sorry you do not have enough money", "Not enough Money!", JOptionPane.INFORMATION_MESSAGE);
                        // Exception if not enough.
                        throw new InsufficientResourcesException("Not Enough Funds");
                    } else {
                    int money2 = bankmoney - withdrawedmoney;
                        JOptionPane.showMessageDialog(null, "You have Withdrawn: " + withdrawedmoney + "\nYou have this amount remaining in your account: " + money2, "Money Withdrawn!", JOptionPane.INFORMATION_MESSAGE);
                    }
                        // Exception if invalid input (Letters and decimal points).
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }