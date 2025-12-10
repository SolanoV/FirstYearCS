package NumericalMethods.main;

import java.util.*;
public class InfoSG {
    Scanner scanner=new Scanner(System.in);
    private String name;
    InfoSG(String name){
        this.name=name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void pressEnterToContinue()
    {
        System.out.print("\nPress ENTER key to continue...\n");
        try
        {
            System.in.read();
            scanner.nextLine();
        }
        catch(Exception e)
        {}
    }


}
