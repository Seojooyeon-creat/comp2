package Chapter7;

interface AnimalI{
    void speak(); //내용 없고 타이틀만 만든 메소드를 가진 추상클래스
    void eat();
}


class DogImpl implements AnimalI{ //extend 못쓰고 implements를 사용해야함.
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
    public void eat(){
        System.out.println("게걸스럽게 먹다.");
    }
}

public interface InterfaceTest {
}
