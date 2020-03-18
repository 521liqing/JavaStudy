public class HelloWorld {
    /*public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        int maxAge = hello.getMaxAge();
        System.out.println("学生中的最大年龄为：" + maxAge);
    }

    public int getMaxAge() {
        int[] ages = {18, 23, 19, 25, 29, 17};
        int maxAge = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
            }
        }
        return maxAge;
    }*/




    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        int max = hello.maxScore();
        System.out.println("学生年龄中的最大值："+max);
    }

    public int maxScore(){
        int[] ages = {18,23,21,19,25,29,30};
        int max = ages[0];
        for(int i = 1;i<ages.length;i++){
            if(ages[i]>max){
                max = ages[i];
            }
        }
        return max;
    }
}
