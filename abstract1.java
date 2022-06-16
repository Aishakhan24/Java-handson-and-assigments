abstract class animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat");
    }
}
class Dog extends animal{
    public void makeSound(){
        System.out.println("Bark bark");
    }
}
class Main1{
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.makeSound();
        d1.eat();
    }
}
    public class abstract1 {
    }

