package dsa;
import java.util.*;

public class ArrayA {
    public static void main(String[] args) {
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Choose between the given options: ");
            System.out.println("1. Sum of N number in an array");
            System.out.println("2. Maximum and Minimum number");
            System.out.println("3. Distinct Number");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Type a number between 1-4: ");
            int x=scan.nextInt();
            switch(x) {
                case 1:
                    System.out.println();
                    System.out.print("Enter size of an array: ");
                    int y=scan.nextInt();
                    int arr1[]=new int [y];
                    System.out.print("Enter elements of the array: ");
                    for(int i=0;i<arr1.length;i++) {
                        arr1[i]=scan.nextInt();
                    }
                    System.out.print("Sum of the elements of the array: ");
                    int sum=0;
                    for(int i=0;i<arr1.length;i++) {
                        sum+=arr1[i];
                    }
                    System.out.println(sum);

                    break;
                case 2:
                    System.out.println();
                    System.out.print("Enter size of an array: ");
                    int a=scan.nextInt();
                    int arr2[]=new int [a];
                    System.out.print("Enter elements of the array: ");
                    for(int i=0;i<a;i++) {
                        arr2[i]=scan.nextInt();
                    }
                    for(int i=0;i<arr2.length;i++) {
                        for(int j=i+1;j<arr2.length;j++) {
                            if(arr2[i] > arr2[j]) {
                                int temp = arr2[i];
                                arr2[i] = arr2[j];
                                arr2[j] = temp;
                            }
                        }
                    }

                    System.out.print("Minimum Value: "+arr2[0]);
                    System.out.print("\nMaximum Value: "+arr2[arr2.length-1]);


                    break;
                case 3:
                    System.out.print("Enter size of an array: ");
                    int n=scan.nextInt();
                    System.out.print("Enter elements of the array: ");
                    int arr3[]=new int[n];
                    int arr4[]=new int[n];

                    for(int i=0;i<n;i++)
                        arr3[i]=scan.nextInt();

                    System.out.print("Distinct elements of the array: ");
                    int i,j;
                    for(i=0;i<n;i++)
                    {
                        for(j=0;j<i;j++)
                            if(arr3[i]==arr3[j])
                                break;
                        if(i==j)
                            arr4[i]=arr3[i];
                    }
                    for(i=0;i<arr4.length;i++) {
                        for(j=i+1;j<arr4.length;j++) {
                            if(arr4[i] > arr4[j]) {
                                int temp = arr4[i];
                                arr4[i] = arr4[j];
                                arr4[j] = temp;
                            }
                        }
                    }
                    for(i=0;i<n;i++) {
                        if(arr4[i]!=0) {
                            System.out.print(arr4[i]+" ");
                        }
                    }

                    break;
                case 4:
                    System.out.print("\n...PROGRAM TERMINATED...");
                    System.exit(0);
                    break;
                default:
                    System.out.print("\n     INVALID INPUT");
                    System.out.print("\n...PROGRAM TERMINATED...");
                    System.exit(0);
                    break;
            }

        }catch(Exception e) {
            System.out.print("\n     INVALID INPUT");
            System.out.print("\n...PROGRAM TERMINATED...");
        }

    }

}
