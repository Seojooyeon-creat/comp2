package Chapter3;

import java.util.Scanner;

/*
do-while 문은 while 문과 비슷하나 반복 조건을 루프의 처음이 아니라
루프의 끝에서 검사한다는 점이 다르다.

do
{
    문장1;

    문장2;

    ...
}
while (조건식);



사용자로부터 월을 입력받는 프로그램을 작성해 보라.
사용자가 올바른 월을 입력할 때까지 계속 반복한다.
사용자가 올바른 월을 입력해야만 다음 문장으로 넘어간다.

(출력)올바른 월을 입력하시오(1-12): (입력)13
(출력)올바른 월을 입력하시오(1-12): (입력)14
(출력)올바른 월을 입력하시오(1-12): (입력)0
(출력)올바른 월을 입력하시오(1-12): (입력)1
(출력)사용자가 입력한 월은 1

 */
public class Sect11_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        do{

            System.out.println("올바른 월을 입력하시오.");
            month = sc.nextInt();
        }while(month < 1 || month >12);
        System.out.println("사용자가 입력한 월은" + " " + month);
        sc.close();

    }

}
