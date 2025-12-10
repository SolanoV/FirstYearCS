package fop.project.studentPackage;

import java.util.*;
import java.text.*;
public class Acadinfo {
    int  sgaq1, sgaq2, sgamid, sgafin, sga, sattend;
    String snumber;
    DecimalFormat dfsga = new DecimalFormat("###.00");

    public void Acadinfo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\nSTUDENT EDUCATION DETAILS(INPUT)");
        System.out.print("\nStudent Number ");
        snumber = scan.nextLine();
        System.out.print("Q1: ");
        sgaq1 = scan.nextInt();
        System.out.print("Q2: ");
        sgaq2 = scan.nextInt();
        System.out.print("Mid: ");
        sgamid = scan.nextInt();
        System.out.print("Fin: ");
        sgafin = scan.nextInt();
        sga=(sgaq1+sgaq2+sgamid+sgafin)/4;
        System.out.print("Student Attendance: ");
        sattend = scan.nextInt();
        displayEducDetails();
    }
    public void displayEducDetails() {
        System.out.println();
        System.out.print("STUDENT EDUCATION DETAILS");
        System.out.print("\nStudent Number "+snumber);
        System.out.print("\nStudent Grade Average: "+dfsga.format(sga));
        System.out.print("\nStudent Attendance: "+sattend+"%");
        System.out.println();
    }

}
