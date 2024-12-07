import java.util.Scanner;

public class OneDArray {
    public static void main (String[]asdf){
        Scanner scanner = new Scanner(System.in);
        String ifstop, example1;
        int input1;
        while (true) {
            System.out.println("Enter 'stop' to stop loop");
            ifstop = scanner.nextLine();
            if (ifstop.equals("stop")) {
                System.out.println("Stopping Code");
                break;}

            System.out.println("Welcome to the Warehouse \nYour items are: \n");
            String[] products = {"Wire", "Switch", "Electric Tape", "Foam", "Light Bulb", "Umbrella", "Paint", "WD-40", "Hammer", "Screw Driver"};
            double[] price = {300, 150, 60, 20, 50, 150, 200, 110, 300, 250};
            System.out.print(products[0] + "\t" + price[0] + "\n" + products[1] + "\t" + price[1] + "\n" + products[2] + "\t" + price[2] + "\n" + products[3] + "\t" + price[3] + "\n" + products[4] + "\t" + price[4] + "\n" + products[5] + "\t" + price[5] + "\n" + products[6] + "\t" + price[6] + "\n" + products[7] + "\t" + price[7] + "\n" + products[8] + "\t" + price[8] + "\n" + products[9] + "\t" + price[9] + "\n\n");
            double price2 = price[0] + price[1] + price[2] + price[3] + price[4] + price[5] + price[6] + price[7] + price[8] + price[9];
            double equalsprice = 10 * price2;
            System.out.println("Total Price: PHP" + equalsprice);

            System.out.println("What product do you want to purchase?\n(0. Wire)\n(1. Switch)\n(2. Electric Tape)\n(3. Foam)\n(4. Light Bulb)\n(5. Umbrella)\n(6. Paint)\n(7. WD-40)\n(8. Hammer)\n(9. Screw Driver)");// Example scanner
            input1 = scanner.nextInt();
            System.out.println("Your product is: " + products[input1] + "\nPrice: " + price[input1] + "\n");

            ifstop = scanner.nextLine();
            if (ifstop.equals("stop")) {
                System.out.println("Stopping Code");
                break;}

        }
    }
}
