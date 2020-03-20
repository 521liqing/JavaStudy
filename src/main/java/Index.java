import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        System.out.print("欢迎使用答答租车系统：\n您是否要租车？1-是，0-否\n");

        Scanner input = new Scanner(System.in);
        int isRent = input.nextInt();
        if (isRent == 1) {
            System.out.print("您可租车的类型及其价目表：\n序号 汽车名称 租金 容量\n");

            Car[] cars = {
                    new AManned("奥迪A6", 500, 4),
                    new AManned("马自达", 400, 4),
                    new AManned("金龙",   800, 20),
                    new ATruck("松花江", 400, 4),
                    new ATruck("依维柯", 1000, 20),
                    new AMulti("皮卡雪", 450, 4, 2)};

            for (int i = 0; i < cars.length; i++) {
                int index = i + 1;
                System.out.println(index + " " + cars[i].toString());
            }

            System.out.println("请选择要租车的数量：");

            int count = input.nextInt();

            Car[] chooseCar = new Car[count];
            for (int i = 0; i < chooseCar.length; i++) {
                System.out.println("您想选择第" + (i + 1) + "辆车，序号为：");
                int carNum = input.nextInt();
                chooseCar[i] = cars[carNum - 1];
            }

            System.out.println("请输入要租的天数：");
            int days = input.nextInt();
            double singleSum = 0;
            double sum = 0;
            for (Car car : chooseCar) {
                singleSum += car.getRent();
            }
            sum = singleSum * days;
            System.out.println("您的租金是：" + sum);
        }
    }
}
