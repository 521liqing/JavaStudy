import java.util.Arrays;

public class MethodDemo4 {
    public static void main(String[] args) {
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        System.out.println("考试成绩的前三名为：");
        MethodDemo4 hello = new MethodDemo4();
        hello.showTop3(scores);
    }

    public void showTop3(int[] scores) {
        Arrays.sort(scores);
        int num = 0;
        for (int i = scores.length - 1; i >= 0; i--) {
            if (scores[i] < 0 || scores[i] > 100) {
                continue;
            }
            num++;
            if (num > 3) {
                break;
            }
            System.out.println(scores[i]);
        }
    }
}
