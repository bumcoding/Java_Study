package Chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)
        // 영화관 좌석
        String[] seatA ={"A1", "A2", "A3", "A4", "A5"};
        String[] seatB ={"B1", "B2", "B3", "B4", "B5"};
        String[] seatC ={"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seats[1][1]); // 0부터 시작하는 인덱스 주소 불러옴
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seat2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seat2[0][2]); // 배열이 있는 부분에만 찾아갈 수 있음
        System.out.println(seat2[2][3]);

    }
}
