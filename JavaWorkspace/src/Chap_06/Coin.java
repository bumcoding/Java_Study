package Chap_06;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {

        // A씨는 여행을 갔다. 여행지에 동작해서 관광상품인 금화8개를 구입했다.
        // 그 중에 동전 1개가 가짜라고 한다.
        // 가짜동전의 무게는 진짜동전과 다르다고 한다.
        // 가짜동전임을 증명해야 환불을 받는데, 주위에 3번만 쓸수 있는 양팔저울만이 있다.


        Scanner sc = new Scanner(System.in);
        int[] coinWeight = new int[]{5, 5, 5, 5, 5, 5, 5, 10}; // 마지막 인덱스의 무게만 다르게 설정(가짜동전)

        int choice_1 = coinWeight[0];
        int choice_2 = coinWeight[0];


        for (int count = 0; count < 3; count++) {

            System.out.print("첫번째 선택한 동전(0~7) : ");
            choice_1 = sc.nextInt(); // 선택에 대한 정수 입력
            System.out.print("두번째 선택한 동전(0~7) : ");
            choice_2 = sc.nextInt(); // 선택에 대한 정수 입력


            if (coinWeight[choice_1] == coinWeight[choice_2]) { // 같은무게 동전끼리 비교할 경우
                System.out.println("가짜 동전이 없습니다!");
                System.out.println("남은기회 : " + (2 - count));
            } else if (coinWeight[choice_1] > coinWeight[choice_2]) { // 첫번째 동전이 가짜 동전일 경우
                System.out.println("가짜 동전이 있습니다!");
                System.out.println("첫번째 동전이 가짜 동전입니다!");
                break; // 동전을 찾았으므로 for문 탈출
            } else if (coinWeight[choice_1] < coinWeight[choice_2]) { // 두번째 동전이 가짜 동전일 경우
                System.out.println("가짜 동전이 있습니다!");
                System.out.println("두번째 동전이 가짜 동전입니다!");
                break; // 동전을 찾았으므로 for문 탈출
            }

            if (2 - count == 0) { // 저울은 세번 사용하면 파괴된다
                System.out.println("저울이 파괴되었습니다...");
            }
        }
    }
}
