public class SOuter {
    /*private int a = 99;
    static int b = 1;

    public static class SInner {
        int b = 2;

        public void test() {
            System.out.println("访问外部类中的b：" + SOuter.b);
            System.out.println("访问内部类中的b：" + b);
        }
    }

    public static void main(String[] args) {
        SInner si = new SInner();
        si.test();
    }*/

    static int score = 84;

    public static class SInner {
        int score = 91;

        public void test() {
            System.out.println("访问外部类中的score：" + SOuter.score);
            System.out.println("访问内部类中的score：" + score);
        }
    }

    public static void main(String[] args) {
        SInner si = new SInner();
        si.test();
    }
}
