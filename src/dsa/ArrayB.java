package dsa;

import java.util.*;

public class ArrayB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1=0, size2=0, size3=0;

        System.out.print("Enter size of the 1st array: ");
        size1= scan.nextInt();
        System.out.print("Enter size of the 2nd array: ");
        size2= scan.nextInt();
        System.out.print("Enter size of the 3rd array: ");
        size3= scan.nextInt();

        System.out.println();
        int array1[]= new int [size1];
        System.out.print("Enter value of the 1st array: ");
        for(int x=0; x<array1.length; x++) {
            array1[x]=scan.nextInt();
        }
        System.out.print("Enter value of the 2nd array: ");
        int array2[]= new int [size2];
        for(int y=0; y<array2.length; y++) {
            array2[y]=scan.nextInt();
        }
        System.out.print("Enter value of the 3rd array: ");
        int array3[]= new int [size3];
        for(int z=0; z<array3.length; z++) {
            array3[z]=scan.nextInt();
        }

        System.out.println();
        System.out.print("Value of array 3: ");
        for(int i=0; i<array3.length; i++) {
            System.out.print(array3[i]+" ");
        }
        System.out.print("\nValue of array 2: ");
        for(int j=0; j<array2.length; j++) {
            System.out.print(array2[j]+" ");
        }
        System.out.print("\nValue of array 1: ");
        for(int k=0; k<array1.length; k++) {
            System.out.print(array1[k]+" ");
        }
        boolean found=false;
        System.out.print("\nCommon Elements: ");
        for(int a=0; a<array1.length; a++) {
            for(int b=0; b<array2.length; b++) {
                for(int c=0; c<array3.length; c++) {
                    if(array1[a]==array2[b]&&array2[b]==array3[c]){
                        System.out.print(array1[a]+" ");
                        found=true;
                    }

                }
            }
        }
        if(!found){
            System.out.print("No Common Elements");
        }
    }
}