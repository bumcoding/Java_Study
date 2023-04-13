package Chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인 1치킨만 가능)
        // 50명 손님 대기

        int max = 20;
        for (int i = 1; i <= 50; i++) { // 초기에는 50번 돌리게 되어있음
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다!");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다!");
                break; // max(20)에서 for을 빠져나감
            }
        }
        System.out.println("재료 소진으로 영업 끝!");

        // while문에서 break
        System.out.println("======while문======");
        int wait = 1; // for문과 다르게 변수 선언을 해주고 넣어야 한다.

        while (wait <=50) {
            System.out.println(wait + "번 손님, 치킨 나왔어요");
            if (wait == max){
                System.out.println("재료가 모두 소진되었습니다!");
                break;
            }
            wait++; // for 문과 다르게 증가연산이 없어 직접 넣어줘야 한다.
        }
        System.out.println("재료 소진으로 영업 끝!");
    }
}
