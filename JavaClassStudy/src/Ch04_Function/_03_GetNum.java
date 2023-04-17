package Ch04_Function;

public class _03_GetNum {
    public static int getRandomNumber(){
        double rand = Math.random();
        int diceValue = (int)(rand * 10); // rand의 범위를 지정
        return diceValue;
    }

    public static void main(String[] args){
        int num = getRandomNumber();
        System.out.println("random number : " + num);
    }
}
