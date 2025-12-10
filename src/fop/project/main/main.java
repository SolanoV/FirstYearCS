package fop.project.main;

import fop.project.employeePackage.Employeeinfo;
import fop.project.studentPackage.Studentinfo;
import fop.project.studentPackage.Acadinfo;

public class main {
    public static void main(String[] args) {

        Employeeinfo ei = new Employeeinfo();
        Employeeinfo ei1 = new Employeeinfo();
        Acadinfo ai = new Acadinfo();
        Acadinfo ai1 = new Acadinfo();
        Studentinfo si = new Studentinfo();
        Studentinfo si1 = new Studentinfo();

        si.Studentinfo();
        ei.display_Employee();
        ai.Acadinfo();

        System.out.println("\n\nNext Student\n");

        si1.Studentinfo();
        ei1.display_Employee();
        ai1.Acadinfo();
    }

}
