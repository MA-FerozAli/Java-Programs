package Arrays;
import java.util.Arrays;

public class removeDuplicateElements {
    
    public static int removeDuplicate(int arr[],int n){
        if (n==0||n==1) {
            return n;
        }
        
        int []  temp=new int [n];
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]!=arr[i+1]) 
            {
                temp[j++]=arr[i];
                
            }
            
        }
        temp[j++]=arr[n-1];
        for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
            
        }
        return j;
    }
    
    public static void main(String args[]){
        int arr[]={10,22,2,2,2,03,3,6,6,5};
        Arrays.sort(arr);
        int Length =arr.length;
        Length=removeDuplicate(arr,Length);
        for (int i = 0; i < Length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
