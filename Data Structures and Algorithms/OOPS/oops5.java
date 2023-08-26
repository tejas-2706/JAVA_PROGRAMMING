import javax.sql.rowset.spi.SyncResolver;
import javax.xml.validation.SchemaFactoryLoader;

public class oops5 {
    public static void main(String[] args) {
        // student s1 = new student();
        // s1.schoolname = "jmv";
        // student s2 = new student();
        // System.out.println(s2.schoolname);
        // student s3 = new student();
        // s3.schoolname = "abc";

        horse h = new horse();
        System.out.println(h.color);
    }
}
// Static Keyword
class student{
    static int return_percentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolname;
    void setname (String name){
        this.name = name;
    }
    String getname (){
        return this.name;
    }
}

// Super Keyword 
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor");
    }
}
class horse extends Animal{
    horse(){
        super();
        super.color = "brown";
        System.out.println("horse constructor");
    }
}
//------------ constructor chaning ------------//

