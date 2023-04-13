package Chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회

        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로 기준
            for (int j = 0; j < 5; j++) { // 가로 기준
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("======================");

        String[][] seat2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seat2.length; i++) { // 세로의 칸 갯수만큼 반복
            for (int j = 0; j < seat2[i].length; j++) { // 가로 길이에 i의 위치 만큼 반복
                System.out.print(seat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("========================================");

        // 세로 10 x 가로 15 크기에 해당하는 영화관 좌석
        String [][] seat3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}; // 세로 인덱스에 영어 선언

        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                seat3[i][j] = eng[i] + (j + 1); // 인덱스 안에 값을 넣어주는 작업
            }
        }

        seat3[7][7] = "__"; // 표를 구매
        seat3[7][8] = "__";

        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                System.out.print(seat3[i][j] + " "); // 들어간 값을 출력
            }
            System.out.println();
        }
    }
}
