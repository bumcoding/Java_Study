package Chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 : 미국 표준 코드

        char c = 'a';

        System.out.println(c);
        System.out.println((int)c); // 아스키 코드 97에 해당하는 a가 출력

        c = 'b';

        System.out.println(c);
        System.out.println((int)c);

        c++;

        System.out.println(c);
        System.out.println((int)c);

        // 숫자 아스키코드

        c = '0';

        System.out.println(c);
        System.out.println((int)c);

        c++; // 아스키코드 0에서 1로 증가
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("================================");

        String [][] seat3 = new String[10][15];
        char ch = 'A'; // 세로 인덱스에 영어 선언


        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                seat3[i][j] = String.valueOf(ch) + (j + 1); // char인 ch 를 스트링으로 변환
            }
            ch++;
        }

        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                System.out.print(seat3[i][j] + " "); // 들어간 값을 출력
            }
            System.out.println();
        }
    }
}
