public class Initail {
    public static void main(String[] args) {
        Telphone tel1 = new CellPhone();
        tel1.call();
        tel1.message();
        Telphone tel2 = new SmartPhone();
        tel2.call();
        tel2.message();

        IPlayGame ip1 = new SmartPhone();
        ip1.playGame();
        IPlayGame ip2 = new Psp();
        ip2.playGame();

        IPlayGame ip3 = new IPlayGame() {
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口");
            }
        };
        ip3.playGame();
        new IPlayGame() {
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口2");
            }
        }.playGame();
    }
}
