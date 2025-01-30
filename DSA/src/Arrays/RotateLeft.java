package Arrays;

// Program to Left rotate the elements of array
import java.util.*;
public class RotateLeft {
    public static void main(String []args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
            
        } 
        System.out.println("Enter the number of left rotations");
        int n=sc.nextInt();
        System.out.println("Array Before Rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       // int n;
        
        for (int i = 0; i < n; i++) {
            int first,j;
            first= arr[i];
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
           
            arr[j]=first;
        }
        System.out.println("\n Array After Left Rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
