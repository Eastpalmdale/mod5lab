import java.util.Scanner;
import java.lang.Math;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        double userWidth;
        double userHeight;
        double diagonal;
        double diagonalSqrt;
        double area;
        double perimeter;
        String trash;
        //outputs/input
        System.out.println("Please enter the width of your rectangle.");
        // if block
        if (in.hasNextDouble()) {
            userWidth = in.nextDouble();

            System.out.println("Please enter the height of your rectangle.");
            if (in.hasNextDouble()) {
                userHeight = in.nextDouble();

                diagonal = (userWidth * userWidth) + (userHeight * userHeight);
                diagonalSqrt = Math.sqrt(diagonal);
                area = userHeight * userWidth;
                perimeter = (userHeight * 2) + (userWidth * 2);

                System.out.println("The length of the diagonal is "+diagonalSqrt);
                System.out.println("The area is "+area+". And the perimeter is "+perimeter);
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("You inputted something that was not a number, please numbers only.");
        }

    }
}
