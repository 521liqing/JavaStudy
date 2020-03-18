import java.util.Arrays;

public class MethodDemo2 {
    /*public static void main(String[] args) {
        MethodDemo2 hello = new MethodDemo2();
        int[] scores = {84,91,74,62};
        hello.print(scores);
    }
    public void print(int[] scores){
        System.out.println(Arrays.toString(scores));
    }*/

    /*public static void main(String[] args) {
        MethodDemo2 hello = new MethodDemo2();
        double avg = hello.calcAvg(94, 81);
        System.out.println("两门课的平均分为：" + avg);
    }

    public double calcAvg(double x, double y) {
        double a = (x + y) / 2;
        return a;
    }*/

    public static void main(String[] args) {
        MethodDemo2 hello = new MethodDemo2();
        int[] scores = {79, 52, 98, 81};
        int count = hello.sort(scores);
        System.out.println("共有" + count + "个成绩信息！");
    }

    public int sort(int[] scores) {
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        return scores.length;
    }
}