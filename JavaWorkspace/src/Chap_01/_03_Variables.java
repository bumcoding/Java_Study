package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "박범찬";
        int time = 15;

        System.out.println(name + "님의 택배가 " + time + "시에 도착합니다!");
        System.out.println(name + "님의 택배가 수령 완료되었습니다!");

        double score = 91.5;
        String grade = "A+";
        name = "이현우";

        System.out.println(name + "님의 평균은 " + score + "점이며, 학점은 " + grade + "입니다!");

        boolean pass = false;

        System.out.println(name + "님은 전교 1등인가요? : " + pass);

        double d = 3.14;
        float f = 3.14f;

        System.out.println(d);
        System.out.println(f);

        long i = 10000000000l;
        System.out.println(i);
        long j = 10_000_000_000l;
        System.out.println(j);

        System.out.println("배운자료형 : int, long, float, double, boolean, char, String");
    }
}
