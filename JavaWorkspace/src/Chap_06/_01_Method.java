package Chap_06;

public class _01_Method {
    // 메소드 정의
    public static void methodFirst() {
        System.out.println("안녕! 난 메소드야!");
    }



    public static void main(String[] args) {
        // 메소드 호출

        System.out.println("메소드 호출 전");

        methodFirst();
        methodFirst();
        methodFirst();

        System.out.println("메소드 호출 후");

    }
}
