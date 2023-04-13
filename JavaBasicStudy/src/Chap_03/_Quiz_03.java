package Chap_03;
/*
000208-3011324인 경우 000208-3 까지만 출력
 */
public class _Quiz_03 {
    public static void main(String[] args) {
        String address = "000208-3011324"; // 주민등록번호

        System.out.println(address.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(address.substring(0, address.indexOf("-") + 2)); // -직전 8까지 출력 + 2칸
    }
}
