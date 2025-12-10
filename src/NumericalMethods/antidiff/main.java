package NumericalMethods.antidiff;

import java.util.*;
import java.text.*;
import NumericalMethods.main.dialogues;

public class main {
    static dialogues dg=new dialogues();
    static Scanner sc=new Scanner(System.in);
    static Scanner scanner=new Scanner(System.in);
    static DecimalFormat df= new DecimalFormat("##,###.00");
    static boolean keep=true;
    public static void main(String[] args) {
        dg.drawString("Anti Differencing of x^-m");

        while(keep) {
            dg.drawString("\nCHOICES");
            dg.drawString("\n  1. Mono");
            dg.drawString("\n  2. All");
            dg.drawString("\n  Type \"quit\" if you want to Quit.");
            dg.drawString("\n[1, 2, quit]: ");
            String x=sc.nextLine();
            switch(x) {
                case "1":
                    mono();
                    break;
                case "2":
                    all();
                    break;
                case "quit":
                    keep=false;
                    dg.drawString("\n Program Terminated\nVinz Eulo A. Solano\n     1 BSCS-1");
                    break;
                default:
                    break;
            }
        }

    }
    public static void mono() {
        dg.drawString("\nEnter the value of m(1..20): ");
        int n=scanner.nextInt();
        if(n==0) {
            dg.drawString("\n[0] -> x^-0 = 1");
        }
        else if(n>20) {
            System.out.println("INVALID OUTPUT");
        }
        else if(n==1) {
            dg.drawString("\n[1] -> x^-1 = ln|x|+C");
        }
        else if(n==2) {
            dg.drawString("\n[2] -> x^-2 = -1/x +C");
        }
        else {
            dg.drawString("\n["+n+"] -> x^-"+n+" = 1/"+((-n)+1)+"x^"+(n-1)+"+C");
        }
    }
    public static void all() {
        for(int i=0;i<=20;i++) {
            if(i==0) {
                dg.drawString("\n[0] -> x^-0 = 1");
            }
            else if(i>20) {
                System.out.println("INVALID OUTPUT");
            }
            else if(i==1) {
                dg.drawString("\n[1] -> x^-1 = ln|x|+C");
            }
            else if(i==2) {
                dg.drawString("\n[2] -> x^-2 = -1/x +C");
            }
            else {
                dg.drawString("\n["+i+"] -> x^-"+i+" = 1/"+((-i)+1)+"x^"+(i-1)+"+C");
            }
        }
    }

}
