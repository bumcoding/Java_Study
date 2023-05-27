package Ch08_OOP.ClassDemo;

public class Minivan {
    public int passengers; // 승객 수
    public int fuelcap; // 소모한 연료의 양
    private final int mpg = 21; // mile per gasoline, 마일당 연료 소모량

    public Minivan(int p, int f, int m) {
        this.init(p, f);
    }

    public Minivan(int p, int f) {
        this.init(p, f);
    }

    public void init(int p, int f) {
        this.passengers = p;
        this.fuelcap = f;
    }

    private int getDistance() {
        return fuelcap * mpg;
    }

    private int getPayments() {
        return getDistance() * passengers * 2000;
    }

    public void showPayment() {
        System.out.printf("passengers : %s, distance : %s\n", this.passengers, getDistance());
        System.out.printf("payments : %s\n", getPayments());
    }
}
//Minivan.java
