package Arrays;
import java.util.Scanner;

public class OddPosition {
    public static void main(String args[]){
        int []arr=new int[5];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Elements of Array");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe elements of array present on odd positions");
        for (int i = 0; i < arr.length; i=i+2) {
            System.out.print(arr[i]+" ");
        }
    }
}
