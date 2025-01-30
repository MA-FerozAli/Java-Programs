// Program to find duplicate in array
package Arrays;
 import java.util.Arrays;
import java.util.Scanner;
public class DulicateSorting {
    public static void findDuplicate(int [] arr ){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                System.out.println("Duplicate element found"+arr[i]);
            }
             
        }
        System.out.println("No Duplicate Element Found"); 
    }
         
    public static void main(String []args){
        int arr[]=new int [5];
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements");
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=sc.nextInt();  
        }
        findDuplicate(arr);
    }
}
