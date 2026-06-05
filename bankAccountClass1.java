//Ani.M, 04/07/2026

public class Main {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount("Ani", 5000);
        
        b1.deposit(500);
        b1.displayBalance();
        b1.withdraw(750);
        b1.displayBalance();
        
    }
}
