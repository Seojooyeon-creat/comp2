package Chapter6;

class Vehicle{
    private int speed;
    private int direction;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void turn(int direction){
        this.direction = direction;
    }

}
class BMW extends Vehicle{}

class Truck extends Vehicle{
    private int cargo;
    public void loadCargo(int cargo){
        this.cargo = cargo;
    }
}

public class TruckTest {
    static void main(String[] args){
        Truck t = new Truck();
        t.setSpeed(5);
        t.loadCargo (100);

   }
}