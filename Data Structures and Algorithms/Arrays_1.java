public class Arrays_1 {
    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] =  marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {23,32,12};
        update(marks);

        for (int i=0; i<marks.length; i++){
            System.out.println("update_marks = "+ marks[i]);
        }
    }
}
