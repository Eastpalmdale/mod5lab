import java.util.Scanner;
import java.util.Random;
class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        // variables
        double userGuess;
        int computerNumber;
        String trash;
        // number generation
        computerNumber = rand.nextInt(10);
        // output/input
        System.out.println("Guess a number between 1 and 10, if you input one higher or lower it will not count.");
        if (in.hasNextDouble()) {
            userGuess = in.nextDouble();
            if (userGuess==computerNumber)
                System.out.println("You guess correctly!");
            if (userGuess > computerNumber)
                System.out.println("Your guess is a higher number than the actual number.");
            if (userGuess < computerNumber)
                System.out.println("Your guess is a lower number than the actual number.");
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter numbers only");
        }
    }
}
