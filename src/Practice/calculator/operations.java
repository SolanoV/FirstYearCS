package Practice.calculator;

public class operations {
    public int calcuAdd(char x, char y) {
        int variable_1= Character.getNumericValue(x);
        int variable_2= Character.getNumericValue(y);
        return variable_1+variable_2;
    }
    public int calcuSub(char x, char y) {
        int variable_1= Character.getNumericValue(x);
        int variable_2= Character.getNumericValue(y);
        return variable_1-variable_2;
    }
    public int calcuMulti(char x, char y) {
        int variable_1= Character.getNumericValue(x);
        int variable_2= Character.getNumericValue(y);
        return variable_1*variable_2;
    }
    public int calcuDiv(char x, char y) {
        int variable_1= Character.getNumericValue(x);
        int variable_2= Character.getNumericValue(y);
        return variable_1/variable_2;
    }
    public char[] wspRemove(char[] charString) {

        for(int k=0;k<charString.length;k++) {
            if (Character.isWhitespace(charString[k])) {
                charString[k]='0';
            }

        }
        for(int i=0;i<charString.length;i++) {
            for (int j = i+1; j < charString.length; j++) {
                if(charString[i] =='0') {
                    char temp = charString[i];
                    charString[i] = charString[j];
                    charString[j] = temp;
                }
            }
        }
        for(int i=0; i<charString.length;i++) {
            if(charString[i]=='0') {
                charString[i]=' ';
            }
        }
        return  charString;
    }

    public char[] connectVariable(char[] charString) {
        for(int i=0;i<charString.length;i++) {
            if(charString[i]!='+') {

            }
        }
        return charString;

    }



}