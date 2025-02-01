package Arrays;
import java.util.Scanner;
public class RightRotate {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int arr[]=new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of Array Before Right Rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nEnter the number of Times to Rotate");
        int n=sc.nextInt();
        
        for (int i = 0; i <n; i++) {
            int last=arr[arr.length-1];
            
            for (int j =arr.length-1; j >0; j--) {
                arr[j]=arr[j-1];
            }
        
          arr[0]=last;          
    } 
        System.out.println("After the Right Rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    
    
}
