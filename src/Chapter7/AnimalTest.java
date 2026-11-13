package Chapter7;

//class Animal{
//    public void speak(){
//        System.out.println("소리를 내다.");
//    }
//}

abstract class Animal{
    abstract public void speak(); //내용 없고 타이틀만 만든 메소드를 가진 추상클래스
    public void eat() {
        System.out.println("먹다.");
    }
}

class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
    public void move(){
        System.out.println("꼬리 흔들면서 뛰다.");
    }
}

class Cat extends Animal{ //추상클래스를 상속받아서 구현을 안하면 에러
    public void speak(){
        System.out.println("야옹야옹");
    } //괄호만 써도 구현된 걸로 컴파일러는 인식
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        //a.move(); //Dog에만 move가 존재. Animal에는 없음.
        a = new Cat();
        a.speak();
        //a = new Animal(); //추상클래스는 객체생성이 안된다,. 대신 상속받아 구현시킨 클래스만 된다.
        Dog d = new Dog();
        d.move();


    }
}
