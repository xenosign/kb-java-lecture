package generic.limit;

public class LongWorld {
    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
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
