import java.util.*;
public class sum_of_infinite_array {

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> list = new ArrayList<Integer>();


        for(List<Long> i1 : queries){
            Long l = i1.get(0);
            Long r = i1.get(1);
            
            int sum = 0;
            int index =0;

            for(Long i=l;i<=r;i++){
                index = (int)((i-1)%n);
                sum = sum+arr[index];
            }
            
            list.add(sum);

        }

        return list;
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();

        while(t!=0){

            int n = in.nextInt();

            int arr[] = new int[n];


            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }


        List<Integer> list = sum_of_infinite_array.sumInRanges(null, 0, null, 0);

            t--;
        }
    }
}
