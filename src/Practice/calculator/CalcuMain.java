package Practice.calculator;
import java.util.*;


public class CalcuMain {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        operations op = new operations();
        String x=scan.nextLine();
        char[] charString = x.toCharArray();
        op.wspRemove(charString);
        op.connectVariable(charString);
        for(int i=0;i<charString.length;i++) {
            try {
                if(charString[i]=='+') {
                    System.out.print(op.calcuAdd(charString[i-1],charString[i+1]));

                }
                else if(charString[i]=='-') {
                    System.out.print(op.calcuSub(charString[i-1],charString[i+1]));

                }
                else if(charString[i]=='*') {
                    System.out.print(op.calcuMulti(charString[i-1],charString[i+1]));

                }
                else if(charString[i]=='/') {
                    System.out.print(op.calcuDiv(charString[i-1],charString[i+1]));

                }
                else if(charString.length==1) {
                    System.out.print("Only 1 input");
                }

            }catch(Exception e) {
                System.out.println("Input lacks operand and variables.");
            }
        }

        scan.close();
    }

}

