package datatypes;

import java.util.Scanner;

public class Task009_CompareInt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstNo = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondNo = input.nextInt();
        
        System.out.println("Sum of two integers: " + sum(firstNo, secondNo));
        System.out.println("Difference of two integers: " + difference(firstNo, secondNo));
        System.out.println("Product of two integers: " + product(firstNo, secondNo));
        System.out.println("Average of two integers: " + average(firstNo, secondNo));
        System.out.println("Distance of two integers: " + distance(firstNo, secondNo));
        System.out.println("Max integer: " + max(firstNo, secondNo));
        System.out.println("Min integer: " + min(firstNo, secondNo));
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int difference(int a, int b) {
        return a - b;
    }
    
    public static int product(int a, int b) {
        return a * b;
    }
    
    public static double average(int a, int b) {
        return (a + b) / 2;
    }
    
    public static int distance(int a, int b) {
        return Math.abs(a - b);
    }
    
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}