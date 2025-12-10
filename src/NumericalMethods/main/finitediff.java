package NumericalMethods.main;

import java.util.Scanner;

public class finitediff {
    static dialogues dg=new dialogues();
    public void finitediffmain(){
        Scanner scanner=new Scanner(System.in);

        dg.drawString("\nEnter the function of x (use 'x' as the variable): ");
        String function=scanner.nextLine();

        dg.drawString("Enter the value of x: ");
        double x=scanner.nextDouble();

        dg.drawString("Enter the value of step-size or h: ");
        double h = scanner.nextDouble();

        dg.drawString("\nf("+x+") = "+function.replaceAll("x", Double.toString(x))+" = "+evaluateFunction(function, x));
        dg.drawString("\nf("+(x+"+1="+(x+1))+") = "+function.replaceAll("x", Double.toString(x+1))+" = "+evaluateFunction(function, x+1));
        dg.drawString("\nf("+(x+"-1="+(x-1))+") = "+function.replaceAll("x", Double.toString(x-1))+" = "+evaluateFunction(function, x-1));
        double centralDifference=(evaluateFunction(function, x + 1) - evaluateFunction(function, x - 1)) / (2 * h);
        double forwardDifference=(evaluateFunction(function, x + 1) - evaluateFunction(function, x)) / h;
        double backwardDifference =(evaluateFunction(function, x) - evaluateFunction(function, x - 1)) / h;
        System.out.println();
        dg.drawString("\nCentral Difference: "+"("+(evaluateFunction(function, x + 1))+") - ("+ evaluateFunction(function, x - 1)+") / (" + (2 * h)+") = "+centralDifference);
        dg.drawString("\nForward Difference: "+"("+(evaluateFunction(function, x + 1))+") - ("+evaluateFunction(function, x)+") / "+h+" = "+forwardDifference);
        dg.drawString("\nBackward Difference: "+"("+(evaluateFunction(function, x))+") - ("+evaluateFunction(function, x - 1)+") /"+h+" = "+backwardDifference);
        System.out.println();

    }

    public static double evaluateFunction(String function, double x){
        function=function.replaceAll("x", Double.toString(x));
        function=function.replaceAll("e", Double.toString(Math.E));
        return evaluateExpression(function);
    }

    public static double evaluateExpression(String expression){
        return new Object() {
            int pos=-1, ch;

            void nextChar() {
                ch=(++pos < expression.length())?expression.charAt(pos):-1;
            }

            boolean eat(int charToEat){
                while (ch==' ')nextChar();
                if (ch==charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x=parseExpression();
                if(pos<expression.length())throw new RuntimeException("Unexpected: " +(char)ch);
                return x;
            }

            double parseExpression(){
                double x=parseTerm();
                for (;;) {
                    if (eat('+')) x+=parseTerm();
                    else if (eat('-'))x-=parseTerm();
                    else return x;
                }
            }

            double parseTerm(){
                double x=parseFactor();
                for (;;){
                    if (eat('*'))x*=parseFactor();
                    else if (eat('/'))x/=parseFactor();
                    else return x;
                }
            }

            double parseFactor(){
                if (eat('+'))
                    return parseFactor();
                if (eat('-'))
                    return -parseFactor();

                double x;
                int startPos=this.pos;
                if(eat('(')){
                    x=parseExpression();
                    eat(')');
                }
                else if((ch>='0'&&ch<='9')||ch=='.'){
                    while((ch>='0'&&ch<='9')||ch=='.')
                        nextChar();
                    x=Double.parseDouble(expression.substring(startPos, this.pos));
                }
                else if(ch>='a'&&ch<='z'){
                    while(ch>='a'&&ch<='z') nextChar();
                    String func=expression.substring(startPos, this.pos);
                    x=parseFactor();
                    if(func.equals("sqrt")){
                        x=Math.sqrt(x);
                    }
                    else if(func.equals("cos")){
                        x=Math.cos(x);
                    }
                    else if(func.equals("sin")){
                        x=Math.sin(x);
                    }
                    else if(func.equals("tan")){
                        x=Math.tan(x);
                    }
                    else throw new RuntimeException
                                ("Unknown function: "+func);
                }
                else{
                    throw new RuntimeException("Unexpected: "+(char)ch);
                }

                if(eat('^'))x=Math.pow(x, parseFactor());

                return x;
            }
        }
                .parse();
    }



}
