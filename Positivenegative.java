//write a java program to reads number from the user and print whether it is positive or negative
import java.util.Scanner;

public class Positivenegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}
//Enter a number: 67
//67 is positive.

