/*
- create a new class for a bank account
- create fields for account characteristics like:
    - account number
    - account balance
    - customer name
    - email
    - phone number
-create getters and setters for each field
- create two additional methods
    - one for depositing funds into the account
    - one for withdrawing funds from the account.
- a customer should not be allowed to withdraw funds if that withdrawal takes their balance negative.
- create a new project called ClassesChallenge witht the usual Main class with the usual main method.
- you'll create an instance of an account class and then test your withdraw and deposit methods.
- you'll print information to the console that confirms what the balance is after the methods are called.

 */
public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "default email","Default phone number");

        System.out.println("Empty constructor is called.");

    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    //creating another constructor using intelliJ
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void deposit(double amountToBeDeposited) {
        accountBalance += amountToBeDeposited;
        System.out.println("Deposit of $" + amountToBeDeposited + " made. New balance is $"+ this.accountBalance);
    }
    public void withdrawl(double amountToBeWithdrawn) {
        if ((accountBalance - amountToBeWithdrawn) < 0 ) {
            System.out.println("Insufficient balance! You only have $"+ this.accountBalance + " in your bank account.");
        } else {
            accountBalance -= amountToBeWithdrawn;
            System.out.println("Withdrawl of $"+ amountToBeWithdrawn + " processed. Remaining balance = $" + this.accountBalance);
        }

    }
}
