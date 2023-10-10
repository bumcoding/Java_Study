package fuck_sangmin;

import java.util.Random;

public class Number10 {
    public static void main(String[] args) {
        // 4x4의 2차원 배열 생성
        int[][] array = new int[4][4];

        // 랜덤 객체 생성
        Random random = new Random();

        // 1에서 10까지의 정수를 10개 랜덤하게 생성하여 배열에 삽입
        for (int k = 0; k < 10; k++) {
            while (true) {
                int i = random.nextInt(4); // 4로 한 이유는 잘 알겠지 씹민아?
                int j = random.nextInt(4);

                // 배열의 해당 위치가 0인 경우만 랜덤한 수를 삽입하고, 루프를 빠져나옴
                if (array[i][j] == 0) {
                    array[i][j] = random.nextInt(10) + 1;
                    break;
                }
            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
