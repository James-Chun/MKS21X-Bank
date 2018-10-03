public class BankAccount {
    private double balance;
    private int accountID;
    private String password;
    
    public BankAccount (int a, double b, String p){
        accountID = a;
        balance = b;
        password = p;
    }
    
    public String toString() {
        return accountID + "/t" + balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountID () {
        return accountID;
    }
    public setPassword (String newPass) {
        password = newPass;
    }
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
    
}


/*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */