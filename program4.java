import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the car's make");
  String make = sc.nextLine();
  
  System.out.println("Enter the car's model");
  String model = sc.nextLine();
  
  System.out.println("Enter the car's fuel level");
  int fuelLevel = sc.nextInt();
  
  System.out.println("Enter if your car is running (boolean)");
  boolean isEngineRunning = sc.nextBoolean();
  
  Car car1 = new Car(make,model,fuelLevel,isEngineRunning);
  
  System.out.println("Do you want to start the engine? (boolean):");
  boolean userEngineChoice = sc.nextBoolean();
  
  if(userEngineChoice){
    car1.startEngine();
  }
  else{
    System.out.println("ok engine no start");
  }
  
  System.out.println("Do you want to drive? (boolean)");
  boolean userDriverChoice = sc.nextBoolean();
  
  if(userDriverChoice){
    car1.drive();
  }
  else{
    System.out.println("Ok you will not start driving!");
  }
  sc.close();
  }
}
