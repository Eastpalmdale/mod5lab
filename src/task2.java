import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double gallonsOfGas;
        double distanceOnTank;
        double gasMileage;
        double gasCost;
        double gasPrices;
        String trash;
        // outputs/inputs
        System.out.println("Please enter how much gas is in your tank");
        // the if block of hell
        if (in.hasNextDouble()) {
            gallonsOfGas = in.nextDouble();

            System.out.println("Please enter your cars gas mileage");
            if (in.hasNextDouble()) {
                gasMileage = in.nextDouble();


                System.out.println("Please enter your gas price");
                if (in.hasNextDouble()) {
                    gasPrices = in.nextDouble();
                    gasCost = (100/gasMileage)*gasPrices;
                    distanceOnTank = gasMileage * gallonsOfGas;
                    System.out.println("Your gas cost total is "+gasCost+"$ per hundred miles");
                    System.out.println("The distance you can get on your current tank is "+distanceOnTank + " miles");
                }
                // bulletproofing
                else {
                    trash = in.nextLine();
                }
            }
        }
    }
}
