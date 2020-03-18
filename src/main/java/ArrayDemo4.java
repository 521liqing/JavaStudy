import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] s = {78, 93, 84, 63};
        Arrays.sort(s);
        System.out.println("排序后数组中的元素的值：");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
