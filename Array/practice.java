import java.util.*;

public class practice {

    public static int partition(ArrayList<Integer> arr,int start,int end){
        int i = start-1;
        int pivot = arr.get(end-1);
        
        for(int j=start;j<end;j++){
            if(arr.get(j)<pivot){
                i++;
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        
        int temp = arr.get(end-1);
        arr.set(end-1,arr.get((i+1)));
        arr.set((i+1),temp);

        return (i+1);
        
    }
    public static void sort(ArrayList<Integer> a,int start,int end){
        if(start<end){
            int partition = partition(a,start,end);
            
            sort(a,start,partition-1);
            sort(a,partition+1,end);
        }

        
    }

    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        array.add(20);
        array.add(100);

        map.put(1,100);
        map.put(1,200);


        System.out.println(array.get(0));

        array.set(0,1000);

        System.out.println(array.get(0));

        System.out.println(map.get(100));


    }

}
