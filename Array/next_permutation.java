import java.util.*;
public class next_permutation {
    
    public static void next_permut(ArrayList<Integer> arr){
        int length = arr.size();
        int pivot = -1;

        for(int i=length-2;i>=0;i--){
            if(arr.get(i)<arr.get(i+1)){
                pivot = i;
                break;
                
            }
        }

        if(pivot==-1){
            int j = length-1;
            for(int i=0;i<length/2;i++){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                j--;
            }


        }
        else{
            int swapindex=pivot;

            
            for(int i=length-1;i>pivot;i--){
                if(arr.get(i)>arr.get(pivot)){
                    swapindex = i;
                    break;
                }
            }

            int temp = arr.get(pivot);
            arr.set(pivot,arr.get(swapindex));
            arr.set(swapindex,temp);


            int j=length-1;
            int iter = length - pivot;
            int i=pivot+1;


            for(int k=0;k<iter/2;k++){
                temp = arr.get(j);
                arr.set(j,arr.get(i));
                arr.set(i,temp);
                j--;
                i++;
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(2);
        arr.add(0);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(0);

        //4,2,0,2,3,2,0
        
        next_permut(arr);

        for(int i: arr){
            System.out.println(i);
        }
    }
}
