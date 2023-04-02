import java.util.*;
public class find_duplicate {
        public static int findDuplicate(ArrayList<Integer> arr) {
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            int length = arr.size();
    
            int duplicate = 0;
    
            for(int i=0;i<length;i++){
                if(map.get(arr.get(i))==null){
                    map.put(arr.get(i),1);
                }
                else{
                    duplicate = arr.get(i);
                    return duplicate;
                }
            }
            return duplicate;
        }
    


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int t=sc.nextInt();

        while(t!=0){
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int elem = sc.nextInt();
            arr.add(elem);
        }

        
        System.out.println(findDuplicate(arr));

        t--;
    }
    }
}
