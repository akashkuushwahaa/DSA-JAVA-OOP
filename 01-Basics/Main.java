// Method Overloading

//class Calculator{
//    int add(int a){
//        return a + 10;
//    }
//
//    int add(int a, int b){
//        return a + b;
//    }
//
//    double add(double a, double b){
//        return a + b;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(calc.add(5));
//        System.out.println(calc.add(5,10));
//        System.out.println(calc.add(2.5, 2.4));
//    }
//}

//Method Overriding
//
//class Animal{
//    void sound(){
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal{
//    void sound(){
//        System.out.println("Dog barks");
//    }
//}
//
//public  class Main {
//    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.sound();
//    }
//}