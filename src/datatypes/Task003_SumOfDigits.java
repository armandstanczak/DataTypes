package datatypes;

import java.util.Scanner;

public class Task003_SumOfDigits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number between 0 and 1000: ");
        int number = input.nextInt();
        
        while (number < 0 || number > 1000) {
            System.out.print("The number is not between 0 and 1000. Input another number: ");
            number = input.nextInt();
        }
        
        System.out.println("Your number is: " + number);
        System.out.println("The sum of all digits in " + number + " is " + sumDigits(number));
    }
    
    public static int sumDigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
