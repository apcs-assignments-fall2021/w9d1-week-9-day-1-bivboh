public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;

    public BankAccount (int b, int a, String str){
        balance = b;
        accountNumber = a;
        preferredName = str;
    }

    public void withrdaw(int x){
        if (balance - x > 0){
            System.out.println(preferredName + ", you have withdrawn $" + x);
            balance = balance - x;
        }
    }

    public void deposit (int x){
        System.out.println(preferredName + ", you have deposited $" + x);
        balance =+ x;
    }

    public int getBalance (){
        return balance;
    }

    public int accountNumber (){
        return accountNumber;
    }

    public String getPrefferedName (){
        return preferredName;
    }

    public String setPrefferedName (String name){
        return preferredName = name;
    }

    public String toString (){
        return (preferredName + ", your account number is " + accountNumber + " and you have " + balance + "$ in your account.");
    }




}