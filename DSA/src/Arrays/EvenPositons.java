package Arrays;
import java.util.Scanner;

public class EvenPositons {
     public static void main(String args[]){
         
         
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of elements insert into array");
        int n=sc.nextInt();
        int []arr=new int[n];
         System.out.println("Enter elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Elements of Array");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe elements of array present on Even positions");
        for (int i = 1; i < arr.length; i=i+2) {
            System.out.print(arr[i]+" ");
        }
    }
}
