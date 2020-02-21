package datatypes;

import java.util.Scanner;

public class Task005_CurrentTime {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        int offset = input.nextInt();
        System.out.println("Current time is " + time(offset));
    }
    
    public static String time(int a) {
        long millis = System.currentTimeMillis();
        long sec = millis / 1000;
        long seconds = sec % 60;
        long min = sec / 60;
        long minutes = min % 60;
        long hr = min / 60;
        long hours = (hr + a) % 24;
        return hours + " : " + minutes + " : " + seconds;
    }
}
