package Chapter7;
interface Remocon{
    void turnOn();
    void turnOff();
}

class RemoconImpl implements Remocon{

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
public class RemoconTest {
    public static void main(String[] args) {
        Remocon r = new Remocon() {
            @Override
            public void turnOn() {
                System.out.println("켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("끕니다.");
            }
        };
        r.turnOff();
        r.turnOn();

    }
}
