//program
package dsa;
import java.util.*;


public class frequncy {
    public static void main(String []args){
        int []arr=new int [10];
        
        Scanner sc=new Scanner(System.in);
        
        
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        int []fr=new int [arr.length];
        int visited=-1;
        for (int i = 0; i < arr.length; i++) {
            int count =1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    //Avoid counting same Element Again
                    fr[j]=visited;
                }
            }
                if (fr[i]!=visited) 
                    fr[i]=count;
                
            }
            
            
            
            System.out.println("----------------------------------");
            System.out.println("Element | Frequency");
            System.out.println("----------------------------------");
            for (int j = 0; j < fr.length; j++) {
                if(fr[j]!=visited)
                System.out.println("   "+arr[j]+" | "+fr[j]);
            
        }
    
    
                        
    System.out.println("----------------------------");
}
}
