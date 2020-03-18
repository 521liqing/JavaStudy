public class Demo2 {
    static int score1 = 90;
    static int score2 = 90;

    public static int sum() {
        return score1 + score2;
    }

    public static void main(String[] args) {
        int allScore = Demo2.sum();
        System.out.println("总分为：" + allScore);
    }
}
