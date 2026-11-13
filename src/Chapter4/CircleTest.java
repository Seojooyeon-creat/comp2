package Chapter4;

class Circle{
    double radius;
    String color;
    public double getArea(){
        return radius * radius * 3.14;
    }
}

public class CircleTest {//파일 이름 앞 public
    public static void main(String[] args) {
        int i = 5;
        Circle c = new Circle();
        c.radius = 10;
        c.color = "red";
        System.out.print(c.getArea());
        //c.getArea();
        //주어.동사
        //대명사.대동사()
    }
    public static void print(double k){
        System.out.println(k);
    }


}
