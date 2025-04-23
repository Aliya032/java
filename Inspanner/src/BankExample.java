public class BankExample {
    public static void main(String[] args) {
        Bank bankObj = new SBI();
        System.out.println("SBI Interest Rate: " + bankObj.getInterestRate());

        bankObj = new PNB();
        System.out.println("PNB Interest Rate: " + bankObj.getInterestRate());

    }
}

abstract class Bank {
    public abstract double getInterestRate();
}

class SBI extends Bank {
    public double getInterestRate() {
        return 7.25;
    }
}

class PNB extends Bank {
    public double getInterestRate() {
        return 5.5;
    }
}
