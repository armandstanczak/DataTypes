package datatypes;

public class Task011_FiniteFloatingPoint {

    public static void main(String[] args) {
        
        float number = 12.3456f;
        boolean numberFinite = Float.isFinite(number);
        boolean numberFinite_0 = Float.isFinite(number / 0);
        boolean numberFinite_1 = Float.isFinite(0f / 0f);
        
        System.out.println("Finite floats");
        System.out.println("Is " + number + " finite: " + numberFinite);
        System.out.println("Is " + number / 0 + " finite: " + numberFinite_0);
        System.out.println("Is " + 0f / 0f + " finite: " + numberFinite_1);
    }
        
}
