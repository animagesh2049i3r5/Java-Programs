import java.util.Scanner;

public class Main{
  
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    while(true){
      System.out.print("Enter number or type quit: ");
      String age = scanner.nextLine();
      
      if(age.equals("quit")){
      break;
    }
    
    int number = Integer.parseInt(age);
      
    if(number % 2 == 0){
      System.out.println("Even");
    }
    
    else{
      System.out.println("Odd");
    }
    
    
    
      
    }
   
  }
  
}
