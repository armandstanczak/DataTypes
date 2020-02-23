package datatypes;

public class Task013_Floor {

    public static void main(String[] args) {
        
        int a = 22;
        int b = 7;
        
        System.out.println("/ " + (a / b));
        System.out.println("floorDiv() " + Math.floorDiv(a, b));
        System.out.println("% " + (a % b));
        System.out.println("floorMod() " + Math.floorMod(a, b));
    }
}
