public class oops {
    public static void main(String[] args) {
        student s1 = new student();
        // student s2 = new student("Tejas");
        student s3 = new student(3169);
        s1.name = "tejas";
        s1.roll = 3169;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 100;
        s1.marks[2] = 100;

        student s2 = new student(s1);
        s2.password = "xyz";
        s1.marks[2] = 40;
        for (int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        // student s4 = new student("df", 5464);
    }
}
class student{
    String name;
    int roll;
    String password;
    int marks[];
    
    // // shallow copy constructor
    // student(student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    // deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    } // Non-paramalized constructor
    
    student(String name){
        marks = new int[3];
        this.name = name;
    }
    student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}