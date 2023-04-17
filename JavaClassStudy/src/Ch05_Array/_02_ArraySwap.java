package Ch05_Array;

public class _02_ArraySwap {
    public static void printArray(int[] target){
        for (int i = 0 ; i < target.length ; i++){
            System.out.println(target[i]);
        }
    }
    public static int[] swap(int[] origin, int sourceIndex, int targetIndex){
        int temp = origin[sourceIndex]; // a, b를 바꾼다 가정하면, a를 빈 공간에 넣기
        origin[sourceIndex] = origin[targetIndex]; // b를 원래 a자리에 넣기
        origin[targetIndex] = temp; // a를 원래 b자리에 넣기
        return origin;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        swap(a, 2,4);
        printArray(a);
    }
}
