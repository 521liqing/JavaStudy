public class Demo3 {
    String name;
    String sex;
    static int age;

    public Demo3() {
        name = "tom";
        System.out.println("通过构造方法初始化name");
    }

    {
        sex = "男";
        System.out.println("通过初始化块初始化sex");
    }

    static {
        age = 20;
        System.out.println("通过静态初始化块初始化age");
    }

    public void show() {
        System.out.println("姓名：" + name + ",性别：" + sex + "，年龄：" + age);

    }

    public static void main(String[] args) {
        Demo3 demo = new Demo3();
        demo.show();
    }
}
