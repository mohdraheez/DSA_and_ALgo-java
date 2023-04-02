public class best_time_to_sell_or_buy {
    public static void main(String[] args){
        int arr[] = {3,2,1,3,6,2};
        int size = arr.length;
        
        int buy = arr[0];
        int profit = 0;


        for(int i=1;i<size;i++){
            if(buy>arr[i])
                buy = arr[i];
            if(profit<(buy-arr[i]))
                profit = buy-arr[i];
        }


        System.out.println("Total profit ="+profit);
    }
}
