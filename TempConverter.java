import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        double f = 0;
        
        System.out.print("Enter temperature in Celsius ");
        c = scanner.nextInt();
        
        f = ((c * 9 / 5) + 32);
        System.out.println("Temperature in Fahrenheit " + f);
        
        System.out.println("Ani 4/6/26");
        
        scanner.close();
    }
}
