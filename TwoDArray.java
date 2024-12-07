import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] were) {
        int sum = 0, sum2 = 0, sum3 = 0;
        int average = 0, average2 = 0, average3 = 0;
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // 2D array to store temperatures for each city for each day
        int temperatures[][] = new int[3][7];

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to your Daily Weather Forecaster, FineWindWeather!");
            System.out.println("Enter the Temperature for City 1!");

            // Input temperatures for City 1
            for (int i = 0; i < temperatures[0].length; i++) {
                System.out.println("Enter the Temperatures for " + days[i]);
                temperatures[0][i] = in.nextInt();
                sum += temperatures[0][i];
            }
            average = sum / temperatures[0].length;
            System.out.println("Temperature Average of City 1: " + average + " Fahrenheit");

            System.out.println("Do you want to stop here?(Y/N)");
            in.nextLine();
            String stop = in.nextLine();
            if (stop.equalsIgnoreCase("Y")) {
                break;
            }

            // Input temperatures for City 2
            System.out.println("Enter Temperature for City 2!");
            for (int i = 0; i < temperatures[1].length; i++) {
                System.out.println("Enter the Temperatures for " + days[i]);
                temperatures[1][i] = in.nextInt();
                sum2 += temperatures[1][i];
            }
            average2 = sum2 / temperatures[1].length;
            System.out.println("Temperature Average of City 2: " + average2 + " Fahrenheit");

            System.out.println("Do you want to stop here?(Y/N)");
            in.nextLine();
            String stop2 = in.nextLine();
            if (stop2.equalsIgnoreCase("Y")) {
                break;
            }

            // Input temperatures for City 3
            System.out.println("Enter Temperature for City 3!");
            for (int i = 0; i < temperatures[2].length; i++) {
                System.out.println("Enter the Temperatures for " + days[i]);
                temperatures[2][i] = in.nextInt();
                sum3 += temperatures[2][i];
            }
            average3 = sum3 / temperatures[2].length;
            System.out.println("Temperature Average of City 3: " + average3 + " Fahrenheit");

            // Find the highest temperature average
            double highestTemperature = Math.max(average, Math.max(average2, average3));
            if (average == highestTemperature) {
                System.out.println("Highest City Temperature is City 1: " + highestTemperature + " Fahrenheit");
            } else if (average2 == highestTemperature) {
                System.out.println("Highest City Temperature is City 2: " + highestTemperature + " Fahrenheit");
            } else if (average3 == highestTemperature) {
                System.out.println("Highest City Temperature is City 3: " + highestTemperature + " Fahrenheit");
            }
        }
        in.close();
    }
}
