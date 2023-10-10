package fuck_sangmin;

import java.util.Scanner;

public class report03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫번째 원의 정보 입력받기
        System.out.println("첫번째 원의 중심과 반지름 입력");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        // 두번째 원의 정보 입력받기
        System.out.println("두번째 원의 중심과 반지름 입력");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        // 두 원의 중심 사이의 거리 계산
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // 두 원이 겹치는지 판별
        if(distance <= r1 + r2) {
            System.out.println("두 원은 서로 겹친다");
        } else {
            System.out.println("두 원은 서로 겹치지 않는다");
        }

        scanner.close();
    }
}
