package Chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문을 통해 별그리기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 삼각 별만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 역삼각 별 만들기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) { // 공백을 4321로 만들기 위해 i의 역수를 쓴다
                System.out.print(" ");
            }
            for (int a = 0; a <= i; a++) { // 공백 후 별을 그려 역삼각형으로 보이게 한다
                System.out.print("*");
            }
            System.out.println(); // 다음칸 이동
        }
    }
}
