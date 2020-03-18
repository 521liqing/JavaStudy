public class ArrayDemo7 {
    public static void main(String[] args) {
        /*int[][] num = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }*/
        int[][] num = new int[3][];
        num[0] = new int[2];
        num[1] = new int[3];
        num[2] = new int[4];

        num[0][0] = 1;
        num[1][1] = 2;
        num[2][3] = 3;
        System.out.println(num[0][0]);
        System.out.println(num[1][1]);
        System.out.println(num[2][3]);
    }
}
