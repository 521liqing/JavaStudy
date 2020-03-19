public class MOuter {
    /*public void show() {
        final int a = 25;
        int b = 13;
        class MInner {
            int c = 2;

            public void print() {
                System.out.println("访问外部类中的方法中的常量a：" + a);
                System.out.println("访问内部类中的常量：" + c);
            }
        }
        MInner mi = new MInner();
        mi.print();
    }

    public static void main(String[] args) {
        MOuter mo = new MOuter();
        mo.show();
    }*/

    String name = "爱慕课";

    public void show() {
        class MInner {
            int score = 83;

            public int getScore() {
                return score + 10;
            }
        }
        MInner mi = new MInner();
        int newScore = mi.getScore();
        System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
    }

    public static void main(String[] args) {
        MOuter mo = new MOuter();
        mo.show();
    }
}
