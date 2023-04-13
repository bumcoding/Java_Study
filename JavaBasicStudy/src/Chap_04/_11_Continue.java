package Chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 손님 중에 안오셔서 다음으로 넘어갔다고 가정

        int max = 20; // 최대 판매 수
        int sold = 0; // 현재 판매 수
        int empty = 15; // 안오신 손님은 15번째 손님

        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "번째 손님 치킨받으세요!");
            if (i == empty){
                System.out.println("15번 손님이 안오셨습니다 넘어갑니다!");
                continue; // continue 이후로 나오는 코드를 넘어가 다음 반복문으로 넘어감
            }

            sold++; // 판매처리

            if (sold == max){
                System.out.println("재료 소진되었다!");
                break;
            }
        }
        System.out.println("영업 종료!");

    }
}
