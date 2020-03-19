public class Initail {
    public static void main(String[] args) {
        Telphone tel1 = new CellPhone();
        tel1.call();
        tel1.message();
        Telphone tel2 = new SmartPhone();
        tel2.call();
        tel2.message();
    }
}
