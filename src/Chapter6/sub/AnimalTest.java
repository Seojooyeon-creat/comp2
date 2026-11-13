package Chapter6.sub;

class Animal{
    public void speak(){
        System.out.println("speak");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eat");
    }
}
class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    public void speak(){

        System.out.println("야옹");
    }
}

public class AnimalTest{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        if(a instanceof Dog){
            System.out.println("Dog");
        }
        if(a instanceof Animal){
            System.out.println("Animal");
        }
        if(a instanceof Cat){
            System.out.println("Cat");
        }
        a = new Cat();
        a.speak();


//        Dog d = new Dog();
//        d.eat();
//        d.speak();
//        Cat c = new Cat();
//        c.speak();
    }

}

