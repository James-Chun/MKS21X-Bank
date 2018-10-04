public class BankAccount {
    private double balance;
    private int accountID;
    private String password;
    
    public BankAccount (double b, int a, String p){
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
    private boolean authenticate(String password) {
        return this.password.equals( password );
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        if (other.authenticate(password) && amount > 0) {
            this.withdraw(amount);
            other.deposit(amount);
            return true;
        }
        return false;
    }

    
}

