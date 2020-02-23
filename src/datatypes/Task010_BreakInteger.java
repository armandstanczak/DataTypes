package datatypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task010_BreakInteger {

    public static void main(String[] args) {
        
        int[] arr = new int[6];
        int i = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Input six non negative digits: ");
        int number = input.nextInt();
        
        while (number > 999999 || number < 100000) {
            System.out.print("This number is not correct. Input six non negative digits: ");
            number = input.nextInt();
        }
        
        while (number > 0) {
            arr[i] = number % 10;
            number /= 10;
            i--;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
