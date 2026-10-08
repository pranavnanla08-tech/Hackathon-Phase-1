import java.util.Scanner;

class BankAccount {
    String accNo, name;
    double balance;

    BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("\nAcc: " + accNo + " | Name: " + name + " | Balance: $" + balance);
    }
}

public class ShortBank {
    static void executeDeposit(BankAccount acc, double amt) { acc.deposit(amt); }
    static void executeWithdrawal(BankAccount acc, double amt) { acc.withdraw(amt); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number, Name, Initial Balance: ");
        BankAccount acc = new BankAccount(sc.next(), sc.next(), sc.nextDouble());

        System.out.print("Enter deposit & withdrawal amounts: ");
        executeDeposit(acc, sc.nextDouble());
        executeWithdrawal(acc, sc.nextDouble());

        acc.display();
        sc.close();
    }
}