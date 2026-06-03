import java.util.Scanner;

public class Main{
  
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Hello Sir what is your name");
    String name = scanner.nextLine();
    String uppername = name.toUpperCase();
    
    System.out.print("Hello Sir what is your age");
    int age = scanner.nextInt();
    
    int fa = 18 - age;
    
    if(fa==1){
    System.out.print("Hellooo " + uppername + "! you are turning 18 in " + fa + " year !!!");
    }
    
    else if(fa==0){
      System.out.print("Looks like your 18 right now");
    }
    
     else if(fa<0){
      System.out.print("Looks like you already turned 18 lol");
    }
    
    else{
      System.out.print("Hellooo " + uppername + "! you are turning 18 in " + fa + " years !!!");
    }
    scanner.close();
  }
  
}
