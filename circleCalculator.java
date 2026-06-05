import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Radius");
        int radius = scanner.nextInt();
        
        double diameter = (radius * 2);
        System.out.println("Diameter: " + diameter);
        
        double circumference = (2 * Math.PI * radius);
        System.out.println("Circumference: " + circumference);
        
        double area = (Math.PI * (radius * radius));
        System.out.println("Area: " + area);
        
        scanner.close();
        
    }
}
