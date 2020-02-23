package datatypes;

import java.util.Scanner;

public class Task008_Power {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = input.nextDouble();
        
        System.out.println("Square: " + square(number));
        System.out.println("Cube: " + cube(number));
        System.out.println("Fourt power: " + pow(number));
    }
    
    public static double square(double a) {
        return Math.pow(a, 2);
    }
    
    public static double cube(double a) {
        return Math.pow(a, 3);
    }
    
    public static double pow(double a) {
        return Math.pow(a, 4);
    }
}
