class Car{
  
  String make;
  String model;
  int fuelLevel;
  boolean isEngineRunning;
  
  Car(String make, String model, int fuelLevel, boolean isEngineRunning ){
    
    this.make = make;
    this.model = model;
    this.fuelLevel = fuelLevel;
    this.isEngineRunning = isEngineRunning;
  }
  
  public void startEngine(){
    if(fuelLevel>0 || isEngineRunning == true){
      System.out.println("The engine is running");
    }
    else{
      System.out.println("There is no fuel !");
  }
  }
  public void drive(){
    if(isEngineRunning){
      fuelLevel -=10;
      System.out.println("You are driving your new fuel amount is " + fuelLevel);
    }
    else{
      System.out.println("Error try starting your engine");
    }
  }
}
