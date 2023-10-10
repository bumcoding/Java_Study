package fuck_sangmin;

import java.util.Scanner;

public class report02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원의 중심과 반지름 입력");
        double cx = scanner.nextDouble(); // 원의 중심 x좌표
        double cy = scanner.nextDouble(); // 원의 중심 y좌표
        double r = scanner.nextDouble(); // 원의 반지름

        System.out.println("점 입력");
        double x = scanner.nextDouble(); // 점의 x좌표
        double y = scanner.nextDouble(); // 점의 y좌표

        // 점 (x, y)와 원의 중심 (cx, cy) 사이의 거리의 제곱을 계산
        double distanceSquared = (x - cx) * (x - cx) + (y - cy) * (y - cy);

        // 점 (x, y)가 원 내부에 있는지 판별
        if(distanceSquared < r * r) {
            System.out.printf("점 (%.1f, %.1f)는 원 안에 있다%n", x, y);
        } else {
            System.out.printf("점 (%.1f, %.1f)는 원 안에 없다%n", x, y);
        }

        scanner.close();
    }
}
