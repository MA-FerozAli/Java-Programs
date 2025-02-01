package Arrays;
import java.util.Scanner;
public class AscendingOrder {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int arr[]=new int [5];
     System.out.println("enter the elements of array");
     for (int i = 0; i < arr.length; i++) {
         arr[i]=sc.nextInt();
        }
     System.out.println("Before Ascending Order");
     for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");
     }int temp=0;
     for (int i = 0; i < arr.length-1; i++) {
         for (int j =i+1; j <arr.length; j++) {
             
         
         if(arr[i]>arr[j])
         {
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
         }}
     System.out.println("");
     for (int i = 0; i < arr.length; i++) {
         System.out.print(""+arr[i]+" ");
     }
 }    
}
