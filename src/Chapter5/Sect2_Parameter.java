/*
[인수(매개변수)전달방법]
전달하는 인수가 int나 double 같은 기초형 변수인 경우에는 인수의 값이 매개변수로 복사된다. 즉 ‘값에 의한 호출’ 방식으로 전달된다.
인수의 값이 매개변수로 복사되기 때문에, 매개변수를 변경하여도 메소드 외부에 있는 인수에 영향을 주지 않는다.
...
a = 10;
b = 20;

int sum = obj.add(a, b);
...



int add(int x, int y) {
    return x + y;
}

//x=a로 복사  y=b로 복사


참조형 변수는 객체의 참조 값(주소)을 저장한다. 따라서 참조형 변수를 메소드에 전달하면 참조 값이 복사되어 전달된다.
이 복사된 참조 값은 동일한 객체를 가리키므로, 메소드 내부에서 객체의 내용을 변경하면 원래 객체에도 영향을 미친다.
Pizza obj = new Pizza(10);

obj.inc(obj);          // 사이즈업 프로모션 기간

System.out.println(obj.radius);   // 11 출력






void inc(Pizza c) {
    c.radius++;
}
Pizza c 는 obj참조값이 복사된다.
 */

//두피자를 비교하여 누가 더큰가를 실행하는 클래스를 아래에 구현
public class Sect2_Parameter {
}
