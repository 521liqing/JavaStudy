public class Demo1 {
    static String hobby = "liqing";

    public static void main(String[] args) {
        System.out.println("通过类名访问hobby:" + Demo1.hobby);
        Demo1 demo = new Demo1();
        System.out.println("通过对象名访问hobby:" + demo.hobby);
        demo.hobby = "李青";
        System.out.println("通过类名访问hobby：" + Demo1.hobby);
    }
}
