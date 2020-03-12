public class ArrayDemo1 {
    public static void printArray(int[] array){
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        printArray(new int[]{13,1,2,6,4,2});
    }
}
