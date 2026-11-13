package Chapter3;

import java.util.Scanner;
/*
정수를 입력 받아 양수이면 양수라고 출력하고 음수이면 음수라고 출력하라
그리고 만약 0이 입력되면 0 으로 나누어 출력하라  아래처럼 되도록 코딩하라
(출력)정수를 입력하시오: (입력)10
(출력)양수입니다.
출력시 양수, 0, 음수 3가지로 나누어 출력한다.
힌트
if (입력값>0){
    System.out.println(양수);
 }else{
    if(입력값=0){
    System.out.println("0입니다");
    else{System.out.println("음수");
 }

 또는
 if (입력값 > 0)
            System.out.println("양수입니다.");
else if (입력값 == 0 )
            System.out.println("0입니다.");
else
            System.out.println("음수입니다.");
 */
public class Sect2_multi_if_selse {
    public static void main(String[] args) {

        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("물의 온도는?");
        temp = sc.nextInt();
        if(temp < 0){
            System.out.println("얼음상태");
        }
        else if (temp >= 0 && temp <= 100){
            System.out.println("액체상태");
        }
        else{
            System.out.println("기체상태");
        }
    }
}
