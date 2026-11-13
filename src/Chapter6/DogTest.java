package Chapter6;

class Animal{
    int weight; //접근자가 없으면 디폴트고 같은 폴더(패키지)에서만 접근 가능.
    private int age;
    public void eat(){
        System.out.println("eat");

    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("왈왈");
    }
}

public class DogTest{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}