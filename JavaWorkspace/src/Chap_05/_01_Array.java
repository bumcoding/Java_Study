package Chap_05;

public interface _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffee1 = "아메리카노";
        String coffee2 = "카페모카";
        String coffee3 = "카페라떼";
        String coffee4 = "카푸치노";

        System.out.println(coffee1 + " 하나");
        System.out.println(coffee2 + " 하나");
        System.out.println(coffee3 + " 하나");
        System.out.println(coffee4 + " 하나");
        System.out.println("주세요!"); // 많아지면 변수 선언이나 출력 값이 너무 복잡해짐
//
//        // 배열 선언 첫번째 방법
//        String[] coffee = new String[3];
//
//        // 배열 선언 두번째 방법
//        String coffees[] = new String[3];
//        coffees[0] = "아메리카노"; // index값은 0부터 시작함
//        coffees[1] = "카페 모카";
//        coffees[2] = "카페 라떼";
//        coffees[3] = "카푸치노";
//
//        // 배열 선언 세번째 방법
//        String[] cafe = new String[] { "아메리카노", "카페모카", "카페라떼", "카푸치노"};

        // 배열 선언 네번째 방법
        String[] cafes = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        // 커피 주문
        System.out.println(cafes[0] + " 하나");
        System.out.println(cafes[1] + " 하나");
        cafes[2] = "에스프레소"; // 중간 수정가능
        System.out.println(cafes[2] + " 하나");
        System.out.println(cafes[3] + " 하나");
        System.out.println("주세요!");
    }
}
