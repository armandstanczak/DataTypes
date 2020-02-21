package datatypes;

import java.util.Scanner;

public class Task001_ConvertCToF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double tempF = input.nextDouble();
        
        while (tempF < -459.67) {
            System.out.print("This is below absolute 0. Pick another degree: ");
            tempF = input.nextDouble();
        }
        
        System.out.println("Temperature of " + tempF + " Fahrenheit is equalt to " + covertToC(tempF) + " Celsius");
    }
    
    public static double covertToC(double a) { 
        return (a - 32) * 5 / 9;
    }
    
}
