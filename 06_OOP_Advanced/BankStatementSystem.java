import java.util.Scanner;

class BankStatementSystem {
    String name;
    String accountType;
    double balance;
    Scanner input = new Scanner(System.in);

    void getInfo() {
        System.out.print("Enter user name: ");
        name = input.nextLine();
        System.out.print("Enter account type: ");
        accountType = input.nextLine();
        System.out.print("Enter starting balance: ");
        balance = input.nextDouble();
    }

    void cashDeposit() {
        System.out.print("\nEnter deposit amount: ");
        double amount = input.nextDouble();
        balance += amount;
        System.out.println("Deposit of " + amount + " made.");
    }

    void withdraw() {
        System.out.print("\nEnter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " made.");
        }
    }

    void statement() {
        System.out.println("\n--- Account Statement ---");
        System.out.println("Name: " + name);
        System.out.println("Account type: " + accountType);
        System.out.print("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankStatementSystem account = new BankStatementSystem();
        account.getInfo();
        account.cashDeposit();
        account.withdraw();
        account.statement();
    }
}
