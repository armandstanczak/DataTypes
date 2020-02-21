package datatypes;

import java.util.Scanner;

public class Task006_BMI {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input weight in kg: ");
        int kg = input.nextInt();
        System.out.print("Input your height in cm: ");
        int cm = input.nextInt();
        System.out.println("Your Body Mass Index is " + BMI(kg, cm));
    }
    
    public static double BMI(int kg, int cm) {
        return (kg / Math.pow(cm, 2) * 10000);
    }
}
