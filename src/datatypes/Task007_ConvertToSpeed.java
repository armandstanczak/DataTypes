package datatypes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task007_ConvertToSpeed {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        float meters = input.nextInt();
        System.out.print("Input hours: ");
        float hours = input.nextInt();
        System.out.print("Input minutes: ");
        float minutes = input.nextInt();
        System.out.print("Input seconds: ");
        float seconds = input.nextInt();
        
        System.out.println("Your speed in m/s is: " + ms(meters, hours, minutes, seconds));
        System.out.println("Your speed in km/h is: " + kmh(meters, hours, minutes, seconds));
        System.out.println("Your speed in miles/h is: " + milesh(meters, hours, minutes, seconds));
    }
    
    static public float ms(float meters, float hours, float minutes, float seconds) {
        return (meters / (seconds + minutes * 60 + hours * 60 * 60));
    }
    
    static public float kmh(float meters, float hours, float minutes, float seconds) {
        return ((meters / 1000) / (hours + minutes / 60 + seconds / 60 / 60));
    }
    
    static public float  milesh(float meters, float hours, float minutes, float seconds) {
        return ((meters / 1609) / (hours + minutes / 60 + seconds / 60 / 60));
    }
}
