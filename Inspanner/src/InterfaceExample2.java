import org.w3c.dom.ls.LSOutput;

/*
Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
 */
interface Accounts{
    void deposit(int balanace, int amtToBeDeposited);
    void withdraw(int balance, int amtToBeWithdrawn);
    void calculateInterest(int interestRate);
    void ViewBalance();

}

class SavingsAccount implements Accounts{
    public void deposit(int balance, int amtToBeDeposited) {
        balance = balance + amtToBeDeposited;
        System.out.println("Savings Account balance after deposit: "+ balance);
    };
    public void withdraw(int balance, int amtToBeWithdrawn) {
        balance = balance - amtToBeWithdrawn;
        System.out.printf("Savings account balance after withdrawl: "+ balance);
    };

    public void calculateInterest(int interestRate) {
        System.out.println("Your interest for "+ interestRate +"% is: "+ interestRate*100 + "for Savings account");
    }
    public void ViewBalance() {
        System.out.println("Your balance in Savings account is: 5000");
    }
}
class CurrentAccount implements Accounts{
    public void deposit(int balance, int amtToBeDeposited) {
        balance = balance + amtToBeDeposited;
        System.out.println("Current Account balance after deposit: "+ balance);
    };
    public void withdraw(int balance, int amtToBeWithdrawn) {
        balance = balance - amtToBeWithdrawn;
        System.out.printf("Current account balance after withdrawl: "+ balance);
    };

    public void calculateInterest(int interestRate) {
        System.out.println("Your interest for "+ interestRate +"% is: "+ interestRate*100 + "for Current account");
    }
    public void ViewBalance() {
        System.out.println("Your balance in Current account is: 3000");
    }
}
public class InterfaceExample2 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        sa.deposit(2000,500);
        sa.withdraw(5000,3000);
        sa.ViewBalance();
        sa.calculateInterest(5);
        ca.deposit(3000,200);
        ca.withdraw(7000,2000);
        ca.ViewBalance();
        ca.calculateInterest(3);
    }
}
