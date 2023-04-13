package Chap_02;
/*
키가 100cm 이므로 탑승 불가능합니다!
키가 130cm 이므로 탑승 가능합니다!
 */
public class _Quiz_02 {
    public static void main(String[] args) {
        int tall1_child = 100;
        int tall2_child = 130;

        String Go1 = (tall1_child >= 120) ? "탑승 가능합니다!" : "탑승 불가능합니다!";
        System.out.println("키가 " + tall1_child + "cm 이므로 " + Go1);

        String Go2 = (tall2_child >= 120) ? "탑승 가능합니다!" : "탑승 불가능합니다!";
        System.out.println("키가 " + tall2_child + "cm 이므로 " + Go2);
    }
}
