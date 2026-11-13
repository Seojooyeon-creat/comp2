package Chapter3;

import java.util.Scanner;

/*
while 문은 조건으로 반복할 때 사용된다. -1의 값이 입력될
때까지 사용자가 입력한 정수의 합계를 계산하여 출력하는
프로그램을 작성하라.
(출력)정수를 입력하시오: (입력)10
(출력)정수를 입력하시오: (입력)20
(출력)정수를 입력하시오: (입력)30
(출력)정수를 입력하시오: (입력)-1
(출력)정수의 합은 60입니다

주의 할점
매 반복마다 새로 만들 필요가 없는 객체라면 while문 밖에서 한 번만 생성하라.
 */
public class Sect10_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, k = 0;
        while(k != -1){
            sum = sum + k;
            System.out.println("정수를 입력하시오.");
            k = sc.nextInt();

        }
        System.out.println(sum);
        sc.close();


    }

}
