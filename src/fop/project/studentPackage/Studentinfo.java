package fop.project.studentPackage;

import java.util.*;
public class Studentinfo {
    Scanner scan=new Scanner(System.in);
    String name, address, fathername, mothername, contactnum;
    int age;
    char gender;
    public void Studentinfo(){
        System.out.println("STUDENT DETAILS(INPUT)");
        System.out.print("Student Name: ");
        name = scan.nextLine();
        System.out.print("Age: ");
        age = scan.nextInt();
        System.out.print("Student Gender: ");
        gender = scan.next().charAt(0);
        scan.nextLine();
        System.out.print("Student Address: ");
        address = scan.nextLine();
        System.out.print("Contact Number: ");
        contactnum = scan.nextLine();
        System.out.print("Father's name: ");
        fathername = scan.nextLine();
        System.out.print("Mother's name: ");
        mothername = scan.nextLine();
        display_student();
    }
    public void display_student(){
        System.out.print("\nSTUDENT DETAILS");
        System.out.print("\nStudent Name: "+name);
        System.out.print("\nAge: "+age);
        System.out.print("\nStudent Gender: "+gender);
        System.out.print("\nStudent Address: "+address);
        System.out.print("\nContact Number: "+contactnum);
        System.out.print("\nFather's name: "+fathername);
        System.out.print("\nMother's name: "+mothername);
        System.out.println();
    }
}
