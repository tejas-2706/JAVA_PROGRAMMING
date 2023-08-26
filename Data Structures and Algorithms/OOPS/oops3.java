public class oops3 {
    public static void main(String[] args) {
        // horse h = new horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // chicken c = new chicken();
        // c.eat();
        // c.walk();

        // Abstrct classes objects cannot be created 
        // but constructors can be made.

        mustang mh = new mustang();
        // Animal -> horse -> mustang
    }
}
// Abstract class
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called...");
        // color = "brown"; 
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk(); // Just given an idea it should be their in other classes which are extended 
}
class horse extends Animal{
    horse(){ // constructor of class
        // color = "Dark brown";
        System.out.println("Horse constructor called...");
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called...");
    }
}
class chicken extends Animal{
    void changecolor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}