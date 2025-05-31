abstract class Animal{
    abstract void makesound();

        void eat(){
            System.out.println("This animal eats food");
        }
    }

    class Dog extends Animal{
        void makesound(){
            System.out.println("Dog Barks");
        }
    }


public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makesound();
        myDog.eat();
    }
}
