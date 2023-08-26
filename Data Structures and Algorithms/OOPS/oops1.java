public class oops1 {
    // Inheritance 
    // Single Level Inheritance
    // Multi Level Inheritance
    // Hierarchial Inheritance
    // Hybrid Inheritance
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eats();
        // Dog dobby = new Dog();
        // dobby.eats();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // ex of Hierarcheial Inheritance 

        // Hybrid Inheritance
        human tejas = new human();
        tejas.talk();
        tejas.walk();
        tejas.eats();

    }   
}
// Base class
class Animal{
    String color;
    void eats(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
// Derived class 
class Mammal extends Animal{
    // int legs;
    void walk(){
        System.out.println("walk");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class human extends Mammal{
    void talk(){
        System.out.println("baat kar rahe hai");
    }
}
class Dog extends Mammal{
    String breed;
}
// class fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swimss");
//     }
// }
