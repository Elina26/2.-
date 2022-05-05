import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] arr;
    private final String name;
    private int day;
    private int month;
    private int year;

    //конструктор
    public FinanceReport(String name, int day, int month, int year, Payment... arr) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
        this.arr = arr.clone();
    }

    //конструктор копирования
    public FinanceReport(FinanceReport financeReport) {
        this.day = financeReport.get_day();
        this.month = financeReport.get_month();
        this.year = financeReport.get_year();
        this.name = financeReport.get_Name();

        arr = new Payment[financeReport.arr.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = new Payment(financeReport.arr[i]);
        }
    }

    //геттеры
    public String get_Name() {
        return name;
    }
    public int get_day() {
        return day;
    }
    public int get_month() {
        return month;
    }
    public int get_year() {
        return year;
    }
    public Payment[] get_Arr() {
        return arr;
    }

    //получение количества платежей
    public int get_Count() {
        return arr.length;
    }

    //доступ к i-му платежу на чтение
    public Payment get_Payment(int index) {
        return arr[index];
    }

    //доступ к i-му платежу на запись
    public void set_Payment(int index, Payment payment) {
        arr[index] = new Payment(payment);
    }

    @Override
    public String toString() {
        return String.format("[Автор: %s, Дата: %d.%d.%d, Платежи: %n%s]", name, day, month, year, Arrays.toString(arr));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return day == that.day && month == that.month && year == that.year && Arrays.equals(arr, that.arr) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, day, month, year, Arrays.hashCode(arr));
    }
}