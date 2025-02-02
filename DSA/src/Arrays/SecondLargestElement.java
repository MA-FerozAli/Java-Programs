package Arrays;
import java.util.*;
public class SecondLargestElement {
    public static int getSecondSmallest(Integer []a,int total){
        List<Integer>list=Arrays.asList(a);
        Collections.sort(list.reversed());
        int element =list.get(total-2);
        return element;
    }
    public static void main(String args[]){
        Integer a[]={12,345,56,87,6,57};
        System.out.println("Smallest Element"+getSecondSmallest(a,6));
    }
}
