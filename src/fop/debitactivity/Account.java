package fop.debitactivity;

import java.util.*;
import java.text.*;

public class Account {
    static Scanner scan=new Scanner(System.in);
    static DecimalFormat df=new DecimalFormat("###.00");
    static DecimalFormat df1=new DecimalFormat("$###.00");
    private String accountName;
    private double balanceAcc;

    public Account(String accountName, double balanceAcc) {
        this.accountName=accountName;
        this.balanceAcc=balanceAcc;
    }
    public double getBalance() {
        return balanceAcc;
    }
    public String getAccName() {
        return accountName;
    }
    public void withdrawal() {
        System.out.print("\nEnter withdrawal amount from "+this.accountName+" balance: ");
        double withdrawal=scan.nextDouble();
        debit(withdrawal);
    }
    public void debit(double withdrawal) {
        if(this.balanceAcc<withdrawal) {
            System.out.println("Debit amount exceeded account balance.\n");
        }
        else if(this.balanceAcc>=withdrawal) {
            System.out.print("\nSubtracting "+df.format(withdrawal)+" from "+this.accountName+" balance\n");
            this.balanceAcc-=withdrawal;


        }
    }
    public void displayBalance() {
        if(this.balanceAcc>=0&&this.balanceAcc<1) {
            System.out.println(getAccName()+" balance: $0"+df.format(getBalance()));
        }
        else {
            System.out.println(getAccName()+" balance: "+df1.format(getBalance()));
        }
    }
}
