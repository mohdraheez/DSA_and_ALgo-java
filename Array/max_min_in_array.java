import java.util.*;
public class max_min_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        int max,min;
        max = min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
            
        }



        System.out.println("max: "+max+" min: "+min);
    }
}
