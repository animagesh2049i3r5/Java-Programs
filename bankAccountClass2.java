public class BankAccount {
    String accountHolder;
    int balance;
    
    BankAccount(String a, int b){
        accountHolder = a;
        balance = b;
        System.out.println("The initial balance is " + balance);
    }
    
    public void deposit(double amt){
        balance += amt;
        System.out.println("Deposited amount is: " + amt);
    }
    
    public void withdraw(double amt){
        if(amt > balance){
            System.out.println("You do not have the necessary funds");
        }
        else{
            balance -= amt;
            System.out.println("Withdrawn amount is: " + amt);
        }
    }
    
    public void displayBalance(){
        System.out.println("The account's balance is " + balance);
    }
}
