package Chapter3;
/*
앞에서는 정수 배열만을 살펴보았는데 실수 배열이나 문자열의 배열도 얼마든지 생성하여 사용할 수 있다.
여기서는 5가지의 피자 토핑의 종류를 문자열 배열에 저장하고 배열에 저장된 문자열을 꺼내서 화면에 출력하여 보자.
for-each 루프를 사용해보자.
(힌트)
String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};

실행시출력결과
Pepperoni Mushrooms Onions Sausage Bacon

 */
public class Sect16_Test {
    public static void main(String[] args) {
        String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
        for(String top : toppings){
            System.out.print(top + " ");
        }

    }
}
