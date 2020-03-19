public class Outer {
    /*private int a = 99;

    public class Inner {
        int b = 2;

        public void test() {
            System.out.println("访问外部类中的a：" + a);
            System.out.println("访问内部类中的b：" + b);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.new Inner();
        i.test();
    }*/

    /*int b = 1;

    public class Inner {
        int b = 2;

        public void test() {
            System.out.println("访问外部类中的b：" + Outer.this.b);
            System.out.println("访问内部类中的b：" + b);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.new Inner();
        i.test();
    }*/

    private String name = "imooc";
    private int age = 20;

    public class Inner {
        String name = "爱慕课";

        public void show() {
            System.out.println("外部类中的name：" + Outer.this.name);
            System.out.println("内部类中的name：" + name);
            System.out.println("外部类中的age：" + Outer.this.age);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.new Inner();
        i.show();
    }
}
