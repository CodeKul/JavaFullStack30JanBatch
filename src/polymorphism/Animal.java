package polymorphism;

public class Animal {
    int age = 10;
    void move(){
        System.out.println("in moving...");
    }
}
class Dog extends Animal{
    int age = 15;
    void move(){
        System.out.println("Dog is moving...");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Animal animal; //reference object

        animal = new Dog();// parent type reference variable refers to a child class object(Run time polymorphism)
        animal.move();
        System.out.println(animal.age);
    }
}