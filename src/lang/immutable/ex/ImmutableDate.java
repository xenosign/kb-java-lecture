package lang.immutable.ex;

public class ImmutableDate {
    private int year;
    private int month;
    private int day;

    public ImmutableDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    ImmutableDate withYear(int newYear) {
        return new ImmutableDate(newYear, this.month, this.day);
    }

    public int getMonth() {
        return month;
    }

    ImmutableDate withMonth(int newMonth) {
        return new ImmutableDate(this.year, newMonth, this.day);
    }

    public int getDay() {
        return day;
    }

    ImmutableDate withDay(int newDay) {
        return new ImmutableDate(this.year, this.month, newDay);
    }

    @Override
    public String toString() {
        return "Date{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }
}
