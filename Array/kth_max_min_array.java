import java.util.*;
public class kth_max_min_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        int max[] = new int[n];
        int min[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            max[i] = arr[i];
        }

        for(int i=0;i<n;i++){
            min[i] = arr[n-1-i];
        }


        int k = sc.nextInt();

        System.out.println("Kth max elem = "+max[k-1]+" min elem= "+min[k-1]);
    }
}
