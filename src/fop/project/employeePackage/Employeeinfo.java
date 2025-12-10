package fop.project.employeePackage;

import java.util.*;

public class Employeeinfo {
    public void display_Employee(){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("EMPLOYEE'S DETAILS(INPUT)");
        System.out.print("\nEmployee Name: ");
        String ename=scan.nextLine();
        System.out.print("Designation: ");
        String desig=scan.nextLine();
        System.out.print("Academic Position: ");
        String apos=scan.nextLine();

        System.out.print("\nEMPLOYEE'S DETAILS");
        System.out.print("\nEmployee Name: "+ename);
        System.out.print("\nDesignation: "+desig);
        System.out.print("\nAcademic Position: "+apos);
    }
}
