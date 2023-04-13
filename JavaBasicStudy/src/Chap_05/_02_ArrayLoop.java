package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] cafes = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        for (int i = 0; i < 4; i++) {
            System.out.println(cafes[i] + " 하나");
        }
        System.out.println("주세요!");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < cafes.length; i++) { // 배열의 크기를 모를때 배열이름.length를 사용함
            System.out.println(cafes[i] + " 하나");
        }
        System.out.println("주세요!");

        System.out.println("====================");
        // enhanced for (for-each) 반복문
        for (String coffee : cafes) { // 처음부터 끝까지 순회하는 for문
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
