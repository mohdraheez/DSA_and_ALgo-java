import java.util.*;
public class reverse{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" Elements");
        for( int i=0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        System.out.println("After reversing");

        int i,j;

        for(i=0,j=n-1;i<n/2;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        
    }
    
}