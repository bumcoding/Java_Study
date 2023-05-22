package Ch08_OOP.ClassDemo;

public class MinivanDemo {
    public static void main(String[] args){
        Minivan minivan = new Minivan(7, 16, 21);
        // Minivan minivan2 = new Minivan(3, 10, 21);

        minivan.showPayment();
        // minivan2.showPayment();

        minivan.init(3, 10);
        minivan.showPayment();
    }
}
//MinivanDemo.java
