import java.util.Objects;

public class DemoClass {

    int number;
    int square;

    public DemoClass(int number) {
        this.number = number;
        this.square = (int) Math.pow(number, 2);
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", square=" + square +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoClass demoClass = (DemoClass) o;
        return number == demoClass.number && square == demoClass.square;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, square);
    }
}
