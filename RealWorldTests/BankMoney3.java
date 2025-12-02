package RealWorldTests;
import java.util.Scanner;

public class BankMoney3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int fixedBalance = 100000;
        int fixedPIN = 2211;

     
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        
        boolean hasEnoughBalance = amount <= fixedBalance;
        boolean isMultipleOf100 = amount % 100 == 0;

        if (!hasEnoughBalance) {
            System.out.println("Not enough money");
        } else if (!isMultipleOf100) {
            System.out.println("Only multiples of 100");
        } else {
           
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

           
            if (pin == fixedPIN) {
                System.out.println("Amount credited successfully...");
            } else {
                System.out.println("Your entered PIN is wrong");
            }
        }

        sc.close();
      
    }
}