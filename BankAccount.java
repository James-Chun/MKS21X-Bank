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
        return accountID + "\t" + balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getAccountID () {
        return accountID;
    }
    
    public void setPassword (String newPass) {
        password = newPass;
    }
    
    //to test setPassword
    /*
    public String getPassword () {
        return password;
    }
    */
    
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

