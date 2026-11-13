package Chapter6;

class TwoDimPoint{
    int x, y;
//    public TwoDimPoint(){
//        x = y = 0;
//    }

    public TwoDimPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class ThreeDim extends TwoDimPoint {
    public ThreeDim(){
        super(5, 5);
    }
    public static void main(String[] args) {
        ThreeDim t = new ThreeDim();
    }
}
