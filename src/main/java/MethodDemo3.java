import java.util.Arrays;

public class MethodDemo3 {
    /*public static void main(String[] args) {
        MethodDemo3 hello = new MethodDemo3();
        hello.print();
        hello.print("immoc");
        hello.print(18);
    }
    public void print(){
        System.out.println("无参的print方法");
    }
    public void print(String name){
        System.out.println("带有一个字符串参数的print方法，参数值为：immoc");
    }
    public void print(int age){
        System.out.println("带有一个整型参数的print方法，参数值为：18");
    }*/

    public static void main(String[] args) {
        MethodDemo3 hello = new MethodDemo3();
        int[] nums = hello.getArray(8);
        System.out.println(Arrays.toString(nums));
    }

    public int[] getArray(int length) {
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        return nums;
    }
}
