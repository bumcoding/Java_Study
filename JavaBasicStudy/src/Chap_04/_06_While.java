package Chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 30; // 전체 거리 30m
        int move = 0; // 이동거리

        while (move < distance) {
            System.out.println("첨벙첨벙(발차기중)");
            move += 3;
            System.out.println("현재 이동거리 : " + move);
        }
        System.out.println("도착 완료!");

        // 무한루프
        /*move = 0;
        while (move < distance) {
            System.out.println("첨벙첨벙(발차기중)");
            System.out.println("현재 이동거리 : " + move);
        } */
        // 탈출하는 문장을 반드시 적어줘야 함
    }
}
