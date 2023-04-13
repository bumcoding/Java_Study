package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[] size = {"250", "255", "260", "265", "270", "275", "280", "285", "290"};

        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i] + " 사이즈 (재고있음)");
        }

        // int로 만들기

        int[] shoe = new int[9];

        for (int i = 0; i < shoe.length; i++) {
            shoe[i] = 250 + (5 * i);
        }

        for (int num :
                shoe) {
            System.out.println("사이즈 " + num + " (재고있음)");
        }
    }
}
