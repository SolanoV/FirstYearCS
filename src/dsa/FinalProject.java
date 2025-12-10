package dsa;
import java.util.Scanner;
public class FinalProject {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("\nHello " + name + ",");
        System.out.println("\nTell me what you want to do. Here are your options:");
        boolean while1=true;
        while(while1) {
            System.out.println("\n[1]Determine if a year is a LEAP YEAR or NOT\n[2]HEIGHT COMPARISON of 3 persons");
            System.out.println("[3]Display the Series\n[4]Display a diamond of asterisk\n[5]Exit");
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();


            switch(choice) {
                case 1:
                    leapYearChecker();
                    break;
                case 2:
                    compareHeights();
                    break;
                case 3:
                    displaySeries();
                    break;
                case 4:
                    displayDiamond();
                    break;
                case 5:

                    System.out.println("PROGRAM TERMINATED");
                    while1=false;
                    break;
                default:
                    System.out.println("1 to 5 lang boi.");
            }
        }
    }
    public static void leapYearChecker(){
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        /*This part will check if the input year is divisible by 4, 100, and 400.
         * If the year is divisible by 4, it further checks if it's divisible by 100 and 400.
         * Since some some years are divisible by 100, but is not a leap year.
         * For example is 1700, 1800, and 1900.
         * If it is a leap year it will print as (year + "is a leap year").
         * If not it will print (year + "is not a leap year."
         */
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
    public static void compareHeights() {
        //The user will input the name of person 1, person 2, and person 3.
        //The user will also input the height of the 3 persons in centimeters.
        String[] name = new String[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of Person " + (i + 1) + ": ");
            name[i] = input.next();
            System.out.print("Enter height of " + name[i] + " (in centimeters): ");
            height[i] = input.nextDouble();
        }
        //This will check if the height of every person is taller than the others.
        //If all the persons have the same height it will print that they have equal heights.
        if (height[0] > height[1] && height[0] > height[2]) {
            System.out.println(name[0] + " is the tallest.");
        } else if (height[1] > height[0] && height[1] > height[2]) {
            System.out.println(name[1] + " is the tallest.");
        } else if (height[2] > height[0] && height[2] > height[1]) {
            System.out.println(name[2] + " is the tallest.");
        } else if (height[0] == height[1] && height[0] > height[2]) {
            System.out.println(name[0] + " and " + name[1] + " are the tallest.");
        } else if (height[0] == height[2] && height[0] > height[1]) {
            System.out.println(name[0] + " and " + name[2] + " are the tallest.");
        } else if (height[1] == height[2] && height[1] > height[0]) {
            System.out.println(name[1] + " and " + name[2] + " are the tallest.");
        } else {
            System.out.println(name[0] + ", " + name[1] + ", and " + name[2] + " have equal heights.");
        }
    }

    public static void displaySeries() {
        System.out.println("Display the Series\n");
        //Asks the user the limit of series to be displayed
        System.out.print("Enter the limit of series: ");
        int n = input.nextInt();

	       /*Instantiating values for the first two arrays because the series
	       should be started in number 1*/
        int[] num = new int[n];
        // Generate and print the rest of the series
        for (int i = 0; i < num.length; i++) {
            if(i == 0 || i == 1)
                num[i] = 1;
            else
                num[i] = num[i-1] + num[i-2];
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void displayDiamond() {
        System.out.print("Enter the number of rows for the top half of the diamond: ");
        int n = input.nextInt();
        // Print top half of the diamond
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            String row = "";
            for (int j = 1; j <= spaces; j++) {
                row += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                row += "*";
            }
            System.out.println(row);
        }
        // Print bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            int spaces = n - i;
            String row = "";
            for (int j = 1; j <= spaces; j++) {
                row += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                row += "*";
            }
            System.out.println(row);
        }
    }

}




