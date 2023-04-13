package Chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "010-6456-2837";

        return phoneNumber; // 변수 설정 후 사용할 값을 반환 시킴
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울시 노원구 공릉동 237-4"; // 바로 반환 값을 설정해도 됨
    }

    // 호텔 액티비티
    public static String getActivity() {
        return "볼링장, 탁구장, 노래방, PC방";
    }

    public static void main(String[] args) {
        // 반환값 Return

        String phoneNumber = getPhoneNumber();
        String address = getAddress();

        System.out.println("호텔 전화번호 : " + phoneNumber);
        System.out.println("호텔 주소 : " + address);
        System.out.println("호텔 액티비티 : " + getActivity()); // 변수 설정없이 함수를 그대로 불러도 됨
    }
}
