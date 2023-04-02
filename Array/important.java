import java.util.*;
public class important{
    public static void main(String[] args){
        // int arr[] = {1,2,42,14,325};
        // System.out.println(arr.length);


        // String a="sfasgr";
        // System.out.println(a.length());

        linkedList();
        hashMap();

    }


    public static void hashMap(){
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,100);
        map.put(2,200);


        System.out.println(map.get(2));

        map.remove(2);

        System.out.println(map.get(2));

        if(map.get(2)==null){
            map.put(2,120);
        }


        System.out.println("is 2 available:");

        System.out.println(map.get(2));

        System.out.println("Size of map is:");
        System.out.println(map.size());


        System.out.println("All values are:");

        for(int i : map.values()){
            System.out.println(i);
        }

        System.out.println("All Keys are:");

        for(int i : map.keySet()){
            System.out.println(i);
        }

        //clears everthing
        map.clear();
    }

    public static void arrayList(){
        //Array list is noting but vector in cpp

        System.out.println("Inside Arraylist");
        ArrayList <String> arraylist1 = new ArrayList<String>();
        ArrayList <Integer> arraylist2 = new ArrayList<Integer>();

        arraylist1.add("abcd");
        arraylist1.add("abcd2");
        arraylist1.add("abcd3");
        arraylist1.add("abcd4");

        arraylist1.set(1,"xyz");
        System.out.println(arraylist1.get(1));

        System.out.println("size is :"+arraylist1.size());
        arraylist1.remove(0);
        System.out.println("After removing a elem size is :"+arraylist1.size());
        arraylist1.clear();
        System.out.println("After clearing size is :"+arraylist1.size());



    }

    public static void integer(){
        Integer a = 100;
        String ab = "200";
        int b = Integer.parseInt(ab);

        System.out.println("Inside Integer class:");
        System.out.println(a);
        System.out.println(b);


        int max = Integer.max(120,200);
        System.out.println(max);

        int sum = Integer.sum(100,200);
        System.out.println(sum);
    }

    public static void hashSet(){
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(100);
        set1.add(10);


        for(int i:set1){
            System.out.println(i);
        }

        boolean a = set1.contains(10);
        System.out.println(a);
    }


    public static void linkedList(){
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("A");
        list1.add("B");   

        list1.addFirst("C");
        list1.addLast("D");

        list1.removeFirst();
        list1.removeLast();

        for(String i : list1){
            System.out.println(i);
        }
    }
}