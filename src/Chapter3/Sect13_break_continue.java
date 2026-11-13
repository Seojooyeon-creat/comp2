package Chapter3;

import java.util.Scanner;

/*

for (int i = 1; i < 6; i++) {
    if (i == 4)
        break;		// i가 4이면 반복문을 벗어난다.
    System.out.println(i);
}


for (int i = 1; i < 6; i++) {
    if (i == 4)
        continue;	       // 4일때는 출력하지 않고 다음 반복으로 넘어간다.
    System.out.println(i);
}

[무한루프]
while 문을 사용할 때, 종료 조건을 만들려면 상당히 까다로운 경우가 있다
>이 경우에는 while(true)를 이용하여 무한 루프를 만들고 무한 루프 안에서 break를 사용하여서 루프를 빠져나가는 조건을 기술하는 편이
가독성이 높고 코딩하기 쉽다
while (c != 'q' || count > 100) {
    ...
}
위보다 아래처럼 쓰는게 좋음
while (true) {

    if (c == 'q') break;

    if (count > 100) break;

    ...

}

[평균계산프로그램]
사용자가 입력한 점수들의 평균을 내는 프로그램을 작성해보자. 만약 사용자가 음수를 입력하면 break 문에 의하여 반복 루프가 종료되게 한다.
점수를 입력하시오: 10
점수를 입력하시오: 20
점수를 입력하시오: -1
평균은 15

 */
public class Sect13_break_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            System.out.println("숫자를 넣으세요.");
            i = sc.nextInt();
            if (i == -1){
                System.out.println("멈춤.");
                break;
            }

        }
        int count = 0;
        while(true){
            System.out.println("숫자를 넣으세요");
            i = sc.nextInt();
            if(i == -1){
                System.out.println("멈춤.");
                continue;
            }
            count++;
        }
    }

}
