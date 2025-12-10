package NumericalMethods.main;

import java.util.Scanner;

public class dialogues {
    static InfoSG isg=new InfoSG("");
    static Scanner scan=new Scanner(System.in);
    static boolean whileyn=true, whileynd2=true;
    static finitediff fd=new finitediff();
    static lagrange lg=new lagrange();
    public static void dialogue1() throws InterruptedException {
        drawString("Hello there! I'm a Mathematical Interpolation Computation and Analysis Helper or M.I.C.A.H");
        Thread.sleep(500);
        nameSetter();
        char yorn=yornd1();
        whileyns(yorn);
        isg.pressEnterToContinue();

    }
    public static void dialogue2() throws InterruptedException{
        drawString("        Welcome "+isg.getName()+", to MICAH!\n------------------------------------------");
        while(whileynd2) {
            menud2();
        }
    }
    public static void dialogue3() throws InterruptedException{
        drawString("\n  Bye Bye, "+isg.getName()+". See you later!");
        drawString("\n-----");
        System.out.print("PROGRAM");
        drawString("  ");
        System.out.print("TERMINATED");
        drawString("-----\n   By: Vinz Eulo A. Solano\n        From 1 BSCS-1");
        whileynd2=false;
    }
    public static void menud2() throws InterruptedException {
        drawString("\n  1. Finite Differences Formula\n  2. Lagrange's Interpolation Formula\n  3. Credits\n  4. Quit\n------------------------------------------");
        drawString("\n  Choose [1..4]: ");
        int menuchoiced2=intreturn();
        switch(menuchoiced2){
            case 1:
                drawStringload("\n*Loading...\n");
                fd.finitediffmain();
                break;
            case 2:
                drawStringload("\n*Loading...\n");
                lg.lagrangemain();
                break;
            case 3:
                drawStringload("\n*Loading...\n");
                drawString("\nCreated By: Vinz Eulo A. Solano\n From 1 BSCS-1 A.Y. 2023-2024\n");
                break;
            case 4:
                dialogue3();
                break;
            default:
                menud2();
                break;
        }
    }
    public static int intreturn() {
        int num=scan.nextInt();
        return num;
    }
    public static void drawString(String text) {
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(20);//0.5s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void drawStringload(String text) {
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(300);//0.5s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
    public static char yornd1() {
        drawString("Is \""+isg.getName()+"\", correct? [Y/N]: ");
        char yorn=scan.nextLine().charAt(0);
        yorn=Character.toUpperCase(yorn);
        return yorn;
    }
    public static void whileyns(char yorn) {
        while(whileyn) {
            switch(yorn) {
                case 'Y':
                    whileyn=false;
                    break;
                case 'N':
                    nameSetter();
                    whileyns(yornd1());
                    break;
                default:
                    yornd1();
                    whileyns(yornd1());
                    break;
            }
        }
    }
    public static void nameSetter() {
        drawString("\nPlease provide your name to continue: ");
        isg.setName(scan.nextLine());
    }
}
