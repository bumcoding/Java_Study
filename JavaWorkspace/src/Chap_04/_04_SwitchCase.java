package Chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 전액 장학금, 2등 반액 장학금, 3등 반액 장학금, 그 외는 장학금 대상 아님

        int rank = 10;

        if (rank == 1){
            System.out.println("전액 장학금 대상자 입니다!");
        } else if (rank == 2) {
            System.out.println("반액 장학금 대상자 입니다!");
        } else if (rank == 3) {
            System.out.println("반액 장학금 대상자 입니다!");
        }else {
            System.out.println("장학금 대상자가 아닙니다!");
        }
        System.out.println("조회 완료!#1");

        // Switch case
        rank = 2;

        switch (rank){
            case 1:{
                System.out.println("전액 장학금");
                break;
            }
            case 2:
            case 3:{
                System.out.println("반액 장학금");
                break;
            }
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료!#2");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 가격
        switch (grade){
            case 1:{
                price+=1000;
            }
            case 2:{
                price+=1000;
            }
            case 3:{
                price+=1000;
                break;
            }
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

        // If else 문을 이용 (여러 조건 또는 범위에 해당하는 경우)
        // Switch case 문을 이용 (명확한 케이스가 있는 경우)
    }
}
