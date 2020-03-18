public class MethodDemo1 {
    /*public static void main(String[] args) {
        MethodDemo1 hello = new MethodDemo1();
        hello.show();
    }

    public void show() {
        System.out.println("welcom to imooc");
    }*/


    /*public int calcSum() {
        int a = 5;
        int b = 12;
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        MethodDemo1 hello = new MethodDemo1();
        int sum = hello.calcSum();
        System.out.println("两数之和：" + sum);
    }*/

    public static void main(String[] args) {
        MethodDemo1 hello = new MethodDemo1();
        double avg = hello.calcAvg();
        System.out.println("平均成绩为：" + avg);
    }

    public double calcAvg() {
        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2;
        return avg;
    }
}
