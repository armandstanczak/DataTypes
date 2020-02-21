package datatypes;

import java.util.Scanner;

public class Task002_ConvertInchToM {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inches: ");
        double lenInch = input.nextDouble();
        
        System.out.println(lenInch + " inch is " + convertToM(lenInch) + " meters");
    }
    
    public static double convertToM(double a) {
        return a * 0.0254;
    }
}
