package datatypes;

public class Task012_SignesInteger {

    public static void main(String[] args) {
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Comparison between two signed numbers is: " + Integer.compare(max, min));
        System.out.println("Comparison between two unsigned numbers is: " + Integer.compareUnsigned(max, min));
    }
}
