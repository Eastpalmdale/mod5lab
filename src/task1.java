import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double userTempC;
        double userTempF;
        String trash;
        // outputs/inputs
        System.out.println("Please enter your temperature in celsius.");
        // the if block of hell
        if (in.hasNextDouble()) {
            userTempC = in.nextDouble();
            userTempF = userTempC - 32 * 5/9;
            System.out.println("Your temperature in fahrenheit is "+userTempF);
        }
        else
            trash = in.nextLine();
            System.out.println("Please enter numbers only");
    }
}
