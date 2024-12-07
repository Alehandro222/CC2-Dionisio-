// Dionisio
import java.util.Scanner; //Calling upon User Input
public class threedimensions {
    public static void main(String[] were) {
        String[] students = {"Mark", "Myles", "Wendel", "Ryan", "Ella"}; //1-D array of Students name
        String[] subject = {"Science", "Math", "English"}; //1-D array of Subjects
        int students1, subjects1, sum, average; //These variables act as inputs
        int[][] grades; // 2-D array to store the students Grades
        int i, j, k; // for 'for' loops
        Scanner sc = new Scanner(System.in); //Declaring variable for scanner input

        System.out.println("Good day Teacher, Shall we start grading?");
        System.out.println("How many Students?(Maximum of 5): ");
        students1 = sc.nextInt(); // How many students will be graded (At least 5 Students)
        if (students1 > 5) {
            System.out.println("Invalid Input, Over the limit");
        }
        System.out.println("How many Subjects?(Maximum of 3): ");
        subjects1 = sc.nextInt(); // How many subjects they will have (At least 3 Subjects)
        if (subjects1 > 3) {
            System.out.println("Invalid Input, Over the limit");
            return;
        }
        grades = new int[students1][subjects1]; // Stores capacity of student and subjects
        int[] averages = new int[students1]; // Stores the average of each of the students
        // These 'for' loops are how to store grades in each subject
        for (i = 0; i < students1; i++) { // This loop allows the user to input each of the students grades in each subject
            System.out.println("Enter the Grade of Student: " + (students[i]));
            sum = 0; //Resets the average to 0 for each student
            for (j = 0; j < subjects1; j++) { // This loop is what allows the user to input grades into each subject
                    System.out.print("Subject: " + subject[j] + ":");
                    grades[i][j] = sc.nextInt(); // Inputting of grades into the subjects
                    sum += grades[i][j]; // Calculating the sum
            }
                    average = sum / subjects1; //The average of the individual student
                    averages[i] = average; //Stores the average data to print in the result
                    System.out.println("This Students Average is: " + students[i] + ":" + average);
            }
        System.out.println("\nStudent Averages:");
        for (i = 0; i < students1; i++) { //Prints the students and averages
            System.out.println(students[i] + ": " + averages[i]);
        }
    }
}


