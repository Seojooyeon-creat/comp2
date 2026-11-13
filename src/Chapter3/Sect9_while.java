package Chapter3;
/*
while 문의 조건식이 참이면, 중괄호 안의 문장을 반복 실행한다.
반복되는 문장이 하나이면 중괄호는 생략할 수 있다.
while (i < 10) {
    System.out.printf("Hello World!\n");
    i++;
}
환영합니다.”를 화면에 5번 출력하는 예제
 */
public class Sect9_while {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int j = 1;
        while(j <= 10){
            System.out.print(j + " ");
            j++;

        }
    }
}
