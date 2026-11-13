package Chapter7;

interface Car{
    void drive();
}

interface Airplane{
    void fly();
}

interface FlyingCarI extends Car, Airplane{}


class FlyingCar implements FlyingCarI{

    @Override
    public void fly() {
        System.out.println("날아 다닌다.");
    }


    @Override
    public void drive() {
        System.out.println("달린다.");
    }
}
public class FlyingCarTest {
    public static void main(String[] args) {
        Car c = new FlyingCar();
        Airplane a = new FlyingCar();
        c.drive();
        a.fly();
        FlyingCar f = new FlyingCar();
        f.drive();
        f.fly();
        FlyingCarI fi = new FlyingCar();
        fi.drive();
    }
}
