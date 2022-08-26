public class Arrays_2 {
    // LINEAR SEARCH
    public static int linear_search(int numbers[], int key){
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static String search_menu(String menu[], String key_menu){
        for (int i=0; i<menu.length; i++){
            if (menu[i] == key_menu){
                return "found";
            }
        }
        return "not found";
    }

    // LARGEST NUMBER & // SMALLEST NUMBER
    public static int get_largest_smallest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>Largest){
                Largest = numbers[i];
            }
            if (numbers[i]<Smallest){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in array is: "+ Smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,5,6,9,10,13,56,78,100};
        String menu[] = {"dosa", "vada paav", "samosa", "edli"};
        String key_menu = "dos";
        int key = 1000;
        // LINEAR SEARCH
        // int index = linear_search(numbers, key);

        // String index = search_menu(menu, key_menu);
        // if (index == "found"){
        //     System.out.println("We found your search in menu i.e: "+ key_menu);
        // }else{
        //     System.out.println("Key is at index = "+ index);
        // }

        // LARGEST NUMBER
        System.out.println("Largest number in array is: "+ get_largest_smallest(numbers));
    }
}
