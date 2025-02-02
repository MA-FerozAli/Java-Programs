package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
    public static int getThirdLargest(int a[],int total){
        Arrays.sort(a);
        return a[total-3];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Third LargestElement is "+getThirdLargest(arr,5));
    }
    
    
    
}
