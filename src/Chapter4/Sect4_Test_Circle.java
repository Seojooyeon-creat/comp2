package Chapter4;
/*
Circle 클래스에서 getArea() 메소드를 오버로딩하여 다양한 상황에서 사용할 수 있도록 만들어보자.
예를 들어, getArea()에 매개변수를 추가하여 원의 반지름을 동적으로 받을 수 있게 한다.
CircleTest 클래스의 main()에서 각 오버로딩된 메소드를 호출하여 그 결과를 확인할 수 있다


class Circle2 {
    public int radius;
    public String color;

    public double getArea() {  // 기본 getArea() 메소드
        return 3.14 * radius * radius;
    }

//아래에 추가할것
}

public class Sect4_Test_Circle {
    public static void main(String[] args) {
        Circle2 obj = new Circle2();  // 객체 생성
        obj.radius = 100;

        obj.color = "blue";

        double area1 = obj.getArea();  // 기본 getArea() 메소드 호출
        System.out.println("원의 면적 = " + area1);

        double area2 = obj.getArea(50);  // 반지름을 매개변수로 받는 getArea() 메소드 호출
        System.out.println("반지름 50의 원의 면적 = " + area2);
    }


}
 */

class Circle2{
    public int radius;
    public String color;

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getArea(int r){
        return 3.14 * r * r;
    }

}

public class Sect4_Test_Circle {
    public static void main(String[] args) {
        Circle2 obj = new Circle2();  // 객체 생성
        obj.radius = 100;

        obj.color = "blue";

        double area1 = obj.getArea();  // 기본 getArea() 메소드 호출
        System.out.println("원의 면적 = " + area1);

        double area2 = obj.getArea(50);  // 반지름을 매개변수로 받는 getArea() 메소드 호출
        System.out.println("반지름 50의 원의 면적 = " + area2);
    }


}