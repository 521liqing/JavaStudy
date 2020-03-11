public class TestArray {
    public static void main(String[] args) {
        double[] myList = {5.6, 4.5, 3.3, 13.2, 4.0,
                34.33, 34.0, 45.45, 99.993, 11123};
        double total = 0;
        for (int i = 0; i < 10; i++) {
            total += myList[i];
        }
        System.out.println("总和为：" + total);
    }
}
