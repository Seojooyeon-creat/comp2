package Chapter7;

interface Vehicle{
    void start();
    default void stop(){
        System.out.println("멈춤");
    };
}

class BMWVehicle implements Vehicle{
    @Override
    public void start() {
        System.out.println("출발");
    }


}

public class DefaultTest {
    public static void main(String[] args) {
        Vehicle v = new BMWVehicle();
        v.start();
    }
}
