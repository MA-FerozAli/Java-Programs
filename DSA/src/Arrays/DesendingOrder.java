
package Arrays;
 //import java.util.Scanner;

public class DesendingOrder {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }}
        }for (int i = 0; i < arr.length; i++) {
             System.out.println("Desending order elements "+ arr[i]);
        }
       
    }
}
