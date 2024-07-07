package generic.limit;

public class GenericWorld<T> {
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double transDouble() {
        return this.number.doubleValue();
    }

    @Override
    public String toString() {
        return "LongWorld{" +
                "number=" + number +
                '}';
    }
}
