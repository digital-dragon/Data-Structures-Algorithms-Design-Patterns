public class DemoClass {

    int number;
    int square;

    public DemoClass(int number) {
        this.number = number;
        this.square = (int) Math.pow(number, 2);
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "number=" + number +
                ", square=" + square +
                '}';
    }
}
