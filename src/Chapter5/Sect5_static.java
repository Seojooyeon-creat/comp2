/*
[인스턴스 멤버와 정적 멤버]

프로그램을 작성하다 보면 여러 개의 객체가 하나의 변수를 공유해야 하는 경우도 있다.
이러한 멤버를 정적 멤버(static member) 또는 클래스 멤버(class member)라고 한다.
- 인스턴스 멤버(instance member): 각 인스턴스(객체)에 속하는 필드나 메소드
- 정적 멤버(static member): 여러 개의 객체가 공유하는 필드나 메소드


[정적 멤버를 만드는 방법]
- 정적 멤버를 선언하려면 멤버 선언 앞에 static을 붙인다.
- 정적 필드는 어디에 이용하면 좋을까? 예를 들어서 어떤 피자 가게에서 하루에 판매되는 피자의 개수를 알고 싶다고 하자. 이러한 경우에 Pizza 클래스에 정적 필드 count를 선언하고 생성자에서 이 정적 필드를 증가시키면 된다.
class Pizza {
       private String toppings;
			// 인스턴스 필드
       static int count = 0;		// 정적 필드

       public Pizza(String toppings) {
             this.toppings = toppings;
             count++;
       }
}
정적 변수는 객체 없이도 사용이 가능하다.
정적 멤버를 사용하려면 단순히 클래스 이름 뒤에 점(.) 연산자를 붙이면 된다.
객체 참조 변수를 통해서도 접근이 가능하다.


public class PizzaTest2 {
       public static void main(String args[]) {
             Pizza p1 = new Pizza("Super Supreme");
             Pizza p2 = new Pizza("Pepperoni");

             int n = Pizza.count;

             System.out.println("지금까지 판매된 피자 개수 = " + n);
       }
}

 */
public class Sect5_static {
}
