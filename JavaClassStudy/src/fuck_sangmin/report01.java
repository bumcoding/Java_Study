package fuck_sangmin;

import java.util.Scanner;

public class report01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점(x,y)의 좌표를 입력하시오");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // 왼쪽 상단 모서리의 좌표
        int x1 = 100;
        int y1 = 100;

        // 오른쪽 하단 모서리의 좌표
        int x2 = 200;
        int y2 = 200;

        if(x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.printf("(%d,%d)는 사각형 안에 있습니다", x, y);
        } else {
            System.out.printf("(%d,%d)는 사각형 안에 없습니다", x, y);
        }

        scanner.close();
    }
}
