package dsa;
import java.util.*;
public class ArrayD {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("ENTER INTERGER VALUE:\t");
        int integer1 = scan.nextInt ();
        System.out.println ("Choose between number 1-6:");
        System.out.println ("1. Sum of digit");
        System.out.println ("2. Reverse the number: ");
        System.out.println ("3. Display all the prime numbers from 2 to n");
        System.out.println ("4. Palindrome Checking");
        System.out.println ("5. Odd or even number");
        System.out.println ("6. Exit");
        System.out.print ("\nEnter here: ");
        int choosenum = scan.nextInt ();



        switch (choosenum)
        {
            case 1:
                String convert= Integer.toString(integer1);
                char[] converted= convert.toCharArray();
                System.out.print("Given: ");
                for(int i=0;i<converted.length;i++){
                    System.out.print(converted[i]);
                }
                int sum = 0;
                for (int i = 0; i < converted.length; i++)
                {
                    sum += Integer.parseInt (String.valueOf (converted[i]));
                }
                System.out.print ("\nSum of digit: " + sum);



                break;
            case 2:
                String convert1= Integer.toString(integer1);
                char[] converted1= convert1.toCharArray();
                System.out.print("Given: ");
                for(int i=0;i<converted1.length;i++){
                    System.out.print(converted1[i]);
                }
                System.out.print("\nReversed number: ");
                for(int i=converted1.length-1;i>=0;i--){
                    System.out.print(converted1[i]);
                }

                break;

            case 3:
                boolean prime[] = new boolean[integer1 + 1];
                for (int i = 0; i <= integer1; i++)
                    prime[i] = true;

                for (int p = 2; p * p <= integer1; p++) {
                    if (prime[p] == true) {

                        for (int i = p * p; i <= integer1; i += p)
                            prime[i] = false;
                    }
                }

                for (int i = 2; i <= integer1; i++) {
                    if (prime[i] == true)
                        System.out.print(i + " ");
                }
                break;
            case 4:
                String convert3= Integer.toString(integer1);
                char[] converted3= convert3.toCharArray();
                char converted3reverse[]= new char[converted3.length];
                int j=converted3.length;
                for(int i=0;i<converted3.length;i++) {
                    converted3reverse[j - 1] = converted3[i];
                    j = j - 1;
                }
                int convert3d = Integer.parseInt(convert3);
                int convert3reverse = Integer.parseInt(String.valueOf(converted3reverse));

                if(convert3d==convert3reverse){
                    System.out.println(integer1 + " is a Palindrome String.");
                }
                else if(convert3d!=convert3reverse){
                    System.out.println(integer1 + " is not a Palindrome String.");
                }

                break;
            case 5:
                String convert2= Integer.toString(integer1);
                char[] converted2= convert2.toCharArray();
                System.out.print("Given: ");
                for(int i=0;i<converted2.length;i++){
                    System.out.print(converted2[i]);
                }
                if(integer1%2==0){
                    System.out.print("\nThe Number is an even number.");
                }
                else if(integer1%2==1){
                    System.out.print("\nThe Number is an odd number.");
                }
                break;
            case 6:
                System.out.print("Terminate the program - Vinz Eulo A. Solano");
                System.exit (0);
                break;
            /*
             * CREATED BY V.E. SOLANO
             */
        }
    }

}