import java.util.*;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Name: Ani.M");
        System.out.println("Date: 3/26/26");
        
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        
        String[] words = sentence.split(" ");
        String initials = "";
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                initials += words[i].substring(0, 1);
            }
        }
        
        System.out.println("Initials: " + initials);
    }
}
