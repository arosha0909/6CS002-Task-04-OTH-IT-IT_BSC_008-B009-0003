package Reflection;

public class reflection_02 {
    public static void main(String[] args) {
        
        Simple s = new Simple();

        s.squareA();
        s.squareB();

        double x = s.getA();
        double y = s.getB();

        System.out.println("s = " + s);
}
}
