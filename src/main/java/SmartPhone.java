public class SmartPhone extends Telphone implements IPlayGame{
    public void call() {
        System.out.println("通过语音打电话");
    }

    public void message() {
        System.out.println("通过语音发短信");
    }
    public void playGame() {
        System.out.println("具有了玩游戏的功能");
    }
}
