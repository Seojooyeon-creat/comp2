package Chapter3;
/*

for 문은 프로그래밍 세계의 ‘계산기처럼 정확한 일꾼’이라고 할 수 있다. “이거 딱 10번만 반복해줘!”라든가,
“숫자 1부터 100까지 쭉 세어봐!” 같은 정해진 횟수의 작업을 수행할 때 제격이다. 그래서 for 루프(loop)라고도 부른다.
[for 문의 기본 구조]

for (초기식; 조건식; 증감식) {
    작업문;
}

[예제]

for (int i = 0; i < 10; i++) {
    System.out.println("Hello World!");
}

[구성 요소]

초기식 : int i = 0
조건식 : i < 10
증감식 : i++
반복문 : System.out.println("Hello World!");


예제 1부터 10까지의 합을 for문을 구현하여 구하라
 */
public class Sect7_For {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.print(i + " ");
        }
    }
}
