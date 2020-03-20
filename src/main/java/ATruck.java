public class ATruck extends Car implements ProductCount {
    protected int productCount;

    public ATruck(String carName, double rent, int productCount) {
        super(carName, rent);
        this.productCount = productCount;
    }

    public int productCount() {
        return productCount;
    }

    public String toString() {
        return carName + " " + rent + "元/天 " + "载货：" + productCount + "吨";
    }
}
