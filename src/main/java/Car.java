public class Car {
    protected String carName;
    protected double rent;

    public Car(String carName, double rent) {
        this.carName = carName;
        this.rent = rent;
    }

    public String getCarName() {
        return this.carName;
    }
    public double getRent() {
        return this.rent;
    }
}
