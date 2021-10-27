import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount (0, 101134, "CAndice");
        acc.deposit(780);
        acc.withrdaw(20);
        System.out.println(acc.toString());






//        Scanner scan = new Scanner(System.in);
//        System.out.println("What is your preferred name?");
//        String name = scan.nextLine();
//        BankAccount acc = new BankAccount (0, 101134, name);



//        // Create a bank account with a balance of 0, the account number 101134, and the given name
//        BankAccount account = new BankAccount(0, 101134, name);
    }
}
