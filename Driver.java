public class Driver {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(12345,9999,"JigglyPuff");
        System.out.println (a);
        
        System.out.println( a.getBalance() );
        System.out.println( a.getAccountID() );
        a.setPassword("Pikachu");
        //setPass test
        //System.out.println ( a.getPassword() );
        
        System.out.println ( a.deposit (1) );
        System.out.println ( a.withdraw (1000) );
        System.out.println ( a.withdraw (50000) );
        
        System.out.println (a);
    } 
}