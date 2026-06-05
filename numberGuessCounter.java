import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int negativecounter = 0;
        int positivecounter = 0;
        int number = 0;
        
        System.out.println("Enter a number (0 to stop):");
        number = scanner.nextInt();
        
        while (number != 0) {
            if (number < 0) {
                negativecounter++;
            } else {
                positivecounter++;
            }
            
            System.out.println("Enter a number (0 to stop):");
            number = scanner.nextInt();
        }
        
        System.out.println("Positive numbers: " + positivecounter);
        System.out.println("Negative numbers: " + negativecounter);
        
        scanner.close();
        
    }
}
