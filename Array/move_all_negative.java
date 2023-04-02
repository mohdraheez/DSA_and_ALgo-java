import java.util.*;
public class move_all_negative {
    public static void main(String[] args){
        int arr[] = {-1,-19,-100,1,10,5};

        Arrays.sort(arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
