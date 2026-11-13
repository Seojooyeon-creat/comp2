package Chapter7;

interface TV{
    void turnOn();
    void turnOff(); //abstract public은 생략 가능.
}

class STV implements TV{

    @Override
    public void turnOn() {
        System.out.println("켜집니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("꺼집니다.");
    }
}

class LTV implements TV{ // 인터페이스도 추상 클래스와 거의 동일

    @Override
    public void turnOn() {
        System.out.println("LTV 킴.");
    }

    @Override
    public void turnOff() {
        System.out.println("LTV 끔.");
    }
}

public interface TVTest {
    public static void main(String[] args) {
        TV t = new STV();
        t.turnOff();
        t.turnOn();

        t = new LTV();
        t.turnOn();
        t.turnOff();
    }

}
