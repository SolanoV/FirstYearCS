package fop.debitactivity;
import java.text.*;

public class AccountRun {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("$###.00");
        Account ac1=new Account("account1", 150.00);
        Account ac2=new Account("account2", 500.53);
        all(ac1, ac2, df);
    }

    public static void all(Account ac1, Account ac2, DecimalFormat df) {
        ac1.displayBalance();
        ac2.displayBalance();
        ac1.withdrawal();
        ac1.displayBalance();
        ac2.displayBalance();
        ac2.withdrawal();
        ac1.displayBalance();
        ac2.displayBalance();
    }

}


