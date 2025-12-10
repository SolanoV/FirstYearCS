package dsa;
import java.util.*;
public class ArrayE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("FIBONACCI SEQUENCE\n");
        System.out.print("Enter the size of the Fibonacci Sequence: ");
        int y=scan.nextInt();
        int f1=0;
        int f2=1;

        for(int i=0;i<y;i++) {
            System.out.print(f1+" ");
            int sum=f1+f2;
            f1=f2;
            f2=sum;
        }
    }
}

