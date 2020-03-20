public class AManned extends Car implements PersonCount {
    protected int personCount;

    public AManned(String carName, double rent, int personCount) {
        super(carName, rent);
        this.personCount = personCount;
    }

    public int personCount() {
        return personCount;
    }

    public String toString() {
        return carName + " " + rent + "元/天 " + "载人：" + personCount + "人";
    }
}
