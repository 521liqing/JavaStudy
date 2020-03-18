public class ArrayDemo6 {
    public static void main(String[] args) {
        String[] hobbys = {"imooc", "爱慕课", "www.imooc.com"};
        System.out.println("***使用for循环输出数组中的元素");
        for (int i = 0; i < hobbys.length; i++) {
            System.out.println(hobbys[i]);
        }
        System.out.println();
        System.out.println("***使用foreach循环输出数组中的元素");
        for (String hobby : hobbys) {
            System.out.println(hobby);
        }
    }
}
