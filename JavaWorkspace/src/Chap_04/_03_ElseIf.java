package Chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 else-if
        // 레몬에이드가 있으면 +1
        // 망고 주스가 있으면 +1
        // 아무것도 없으면 아이스 아메리카노 +1

        boolean lemonAde = false;
        boolean mangoJuice = false;

        if (lemonAde){
            System.out.println("레몬에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문 완료!");
    }
}
