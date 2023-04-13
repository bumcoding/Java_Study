package Chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 Do while

        int distance = 30; // 전체 거리
        int move = 0; // 이동거리
        double height = 1.8; // 키 180cm

        while (move + height < distance){
            System.out.println("첨벙첨벙(발차기중)");
            move += 3;
            System.out.println("현재 이동거리 : " + move);
        }
        System.out.println("도착완료!");

        // Do while 문 적용
        System.out.println("=======Do while문=======");

        do {
            System.out.println("첨벙첨벙(발차기중)");
            move += 3;
            System.out.println("현재 이동거리 : " + move);
        } while (move + height < distance);
        System.out.println("도착완료!");
    }
}
