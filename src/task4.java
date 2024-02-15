import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        double metersMeasurement;
        double metricToMiles;
        double metricToFeet;
        double metricToInches;
        String trash;
        // output/input
        System.out.println("Please enter your measurement in metric.");
        // if block
        if (in.hasNextDouble()) {
            metersMeasurement = in.nextDouble();
            metricToMiles = metersMeasurement * 0.000621371;
            metricToFeet =  metersMeasurement * 3.28084;
            metricToInches = metersMeasurement * 39.37;
            System.out.println("The amount of meters inputted in miles is "+metricToMiles+" in feet is "+metricToFeet+" in inches is "+metricToInches);
        }
        else {
            trash = in.nextLine();
            System.out.println("You can only input numbers.");
        }

    }
}
