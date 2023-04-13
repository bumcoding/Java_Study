package Chap_01;

/*
(실행 결과)
1224번 버스
약 5분 후 도착
남은 거리 1.5km
 */
public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (1224번)
        String busNumber = "1224번";

        // 남은 시간 (5분)
        int minute = 5;

        // 남은 거리 (1.5km)
        double distance = 1.5;

        System.out.println(busNumber + "버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
