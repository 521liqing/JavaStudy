public class Demo4 {
    public class Inner {
        public void show() {
            System.out.println("加油！李青。");
        }
    }

    public static void main(String[] args) {
        Demo4 demo = new Demo4();
        Inner i = demo.new Inner();
        i.show();
    }
}
