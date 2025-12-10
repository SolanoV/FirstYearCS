package Practice.tictactoe;
import java.util.*;
public class TicTacMain {
    static boolean bol=true;
    public static void main(String[] args) {
        char tictac[][]=new char[3][3];
        System.out.println("A game of Tic Tac Toe :) XOXOXO");

        while(bol) {
            printGrid(tictac);
            insertTicTac(tictac);
        }


    }
    public static void printGrid(char tictac[][]) {
        System.out.println("        ROW\nCOL__1____2____3__");
        for(int i=0;i<tictac.length;i++) {
            System.out.print((i+1)+" |  ");
            for(int j=0;j<tictac[i].length;j++) {
                if(tictac[i][j]=='\0') {
                    System.out.print("  |  ");
                }
                else {
                    System.out.print(tictac[i][j]+" |  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
    public static void insertTicTac(char tictac[][]) {
        Scanner scan=new Scanner(System.in);
        System.out.print("\nType the column, row, and symbol[ex. 1, 2, x]: ");
        int col=scan.nextInt();
        int row=scan.nextInt();
        char sym=scan.next().charAt(0);
        tictac[col-1][row-1]=sym;
        System.out.print("Enter true or false: ");
        char tof=scan.next().charAt(0);
        if(tof=='f') {
            bol=false;
        }
        else {

        }
    }

}
