public class AMulti extends Car implements PersonCount, ProductCount {
    protected int personCount;
    protected int productCount;

    public AMulti(String carName, double rent, int personCount, int productCount) {
        super(carName, rent);
        this.personCount = personCount;
        this.productCount = productCount;
    }

    public int personCount() {
        return personCount;
    }

    public int productCount() {
        return productCount;
    }

    public String toString() {
        return carName + " " + rent + "元/天 " + " 载人：" + personCount + "人 " + "载货：" + productCount + "吨";
    }
}
