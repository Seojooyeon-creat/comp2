package Chapter3;
/*
int[][] s = new int[3][5];

     ↑             ↑   ↑
     │             │   │
     │          행의 개수
     │                 열의 개수
     │
  2개의 대괄호가
  2차원 배열을 나타낸다.


                    1열         2열         3열         4열         5열

1행              s[0][0]    s[0][1]    s[0][2]    s[0][3]    s[0][4]

2행              s[1][0]    s[1][1]    s[1][2]    s[1][3]    s[1][4]

3행              s[2][0]    s[2][1]    s[2][2]    s[2][3]    s[2][4]

[2차원 배열속 값을 출력]-> 중첩된 루프 사용
for (int i = 0; i < 3; i++)
    for (int j = 0; j < 5; j++)
        System.out.println(s[i][j]);

아래는 배열을 초기화
int[][] testArray = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
위 배열을 출력해보자
 */
public class Sect17_two_dimensional_array {
    public static void main(String[] args) {
        int [][] i = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int k = 0; k < 3; k++){
            for(int j = 0; j < 3; j++){
                System.out.println(i[k][j]);
            }

        }
        System.out.println(i[0][0]);
    }
}
