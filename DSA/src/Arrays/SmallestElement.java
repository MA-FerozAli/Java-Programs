package Arrays;
import java.util.Scanner;
      public class  SmallestElement {
          public static void main(String args[]){
              Scanner sc =new Scanner(System.in);
              System.out.println("Enter Number of elements insert into array");
               int n=sc.nextInt();
               int []arr=new int[n];
               System.out.println("Enter elements of Array");
                  for (int i = 0; i < arr.length; i++) {
                       arr[i]=sc.nextInt();
            
                 }
                 int max=arr[0];
                 for (int i = 0; i < arr.length; i++) {
                    if (arr[i]<max) 
                      max=arr[i];
                  }
              System.out.println("The Smallest Element of Array is "+max);
          }
    
}


