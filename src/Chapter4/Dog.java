package Chapter4;

class Mammal {
    private String name;
    private int age;

    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){ }
}
public class Dog extends Mammal{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
    }
}