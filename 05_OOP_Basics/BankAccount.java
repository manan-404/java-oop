import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    Scanner input = new Scanner(System.in);

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Your balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            System.out.println("New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.print("Enter account number: ");
        acc.accountNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter account holder name: ");
        acc.accountHolder = input.nextLine();
        System.out.print("Enter starting balance: ");
        acc.balance = input.nextDouble();

        acc.deposit();
        acc.withdraw();
    }
}
