package datatypes;

public class Task015_NextUp {

    public static void main(String[] args) {
        
        float first = 0.2f;
        float firstUp = Math.nextUp(first);
        float firstDown = Math.nextDown(first);
        System.out.println("Initial number: " + first + "; next up is: " + firstUp + "; next down is: " + firstDown);
        
        double second = 0.2d;
        double secondUp = Math.nextUp(second);
        double secondDown = Math.nextDown(second);
        System.out.println("Initial number: " + second + "; next up is: " + secondUp + "; next down is: " + secondDown);
        
    }
        
}
