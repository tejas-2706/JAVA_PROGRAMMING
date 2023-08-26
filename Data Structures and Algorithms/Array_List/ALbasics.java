import java.util.ArrayList;

public class ALbasics {
    public static void main(String args[]) {
        // ArrayList<String> list = new ArrayList<>();
        // list.add("hello");
        // list.add("world");
        // System.out.println(list); 
        // String ele = list.get(0);
        // System.out.println(ele); 
        // // list.set(0, "heybro");
        // // System.out.println(list); ;
        // System.out.println(list.contains("hello")); 
        // list.remove("hello");
        // System.out.println(list); 

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        // maximum in arraylist
        // int max = Integer.MIN_VALUE;
        // for (int i=0; i<=list.size()-1; i++) {
        //     // if (list.get(i) > max) {
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // swap 2 numbers
        System.out.println(list);
        int index1 = 1;
        int index2 = 3;
        swap(list, index1, index2);
        System.out.println(list);


        // multi dimensional list
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(24);
        list1.add(2);
        list1.add(4);
        mainlist.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(32);
        list2.add(24);
        list2.add(89);
        mainlist.add(list2);
        list2.remove(0);
        PrintArrayList(mainlist);
    }
    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void PrintArrayList(ArrayList<ArrayList<Integer>> mainlist) {
        for (int i=0; i<mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j=0; j<currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
