public class oops2 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));

        Deer d = new Deer();
        d.eat(); // when child class is make to child class only in overriding 
    }
}
// function Oveloading 
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
// function Overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
