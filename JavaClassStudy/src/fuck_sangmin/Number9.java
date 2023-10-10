package fuck_sangmin;

public class Number9 {
    public static void main(String[] args) {
        // 4x4의 2차원 배열 생성
        int[][] array = new int[4][4];
        
        // 배열에 1에서 10까지 랜덤한 정수 할당
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10) + 1;
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
