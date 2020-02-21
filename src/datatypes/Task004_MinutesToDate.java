package datatypes;

import java.util.Scanner;

public class Task004_MinutesToDate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number of minutes: ");
        long number = input.nextLong();
        System.out.println(number + " minutes is approximately " + convert(number));
    }
    
    public static String convert(long a) {
        int minutesYear = 60 * 24 * 365;
        int years = (int) a / minutesYear;
        int days = ((int) a / 60 / 24 ) % 365;
        
        return years + " years and " + days + " days";
    }
}
