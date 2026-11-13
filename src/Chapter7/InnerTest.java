package Chapter7;

class Outer{
    private int value = 10;
    class Inner{
        public void myMethod() {
            System.out.println(value);
        }
    }
}
public class InnerTest {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner(); //생성
    }
}
