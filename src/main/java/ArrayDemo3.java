public class ArrayDemo3 {
    public static void main(String[] args) {
        String s[][] = new String[2][3];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("To");
        s[1][1] = new String("You");
        s[1][2] = new String("!");

        for (String[] Strings : s) {
            for (String anString : Strings) {
                System.out.print(anString + " ");
            }
        }

       /* int[][] array = {{1,11},{2,22},{3,33}};
        for (int[] ints : array) {
            for(int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }*/
    }
}