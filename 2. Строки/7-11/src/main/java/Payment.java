import java.util.Objects;

public class Payment {
    private String name;
    private int day;
    private int month;
    private int year;
    private int Amount_of_payment;

    //Конструктор
    public Payment(String name, int day, int month, int year, int Amount_of_payment) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.Amount_of_payment = Amount_of_payment;
        //set_name(name);
        //set_Amount_of_payment(Amount_of_payment);
    }

    //Конструктор копирования
    public Payment(Payment payment) {
        this.day = payment.get_day();
        this.month = payment.get_month();
        this.year = payment.get_year();
        this.set_name(payment.get_name());
        this.set_Amount_of_payment(payment.get_Amount_of_payment());
    }

    //геттеры
    public String get_name() {
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
    public int get_Amount_of_payment() {
        return Amount_of_payment;
    }

    //сеттеры
    public void set_name(String name) {
        this.name = name;
    }
    public void set_day(int day) {
        this.day = day;
    }
    public void set_month(int month) {
        this.month = month;
    }
    public void set_year(int year) {
        this.year = year;
    }
    public void set_Amount_of_payment(int Amount_of_payment) {
        this.Amount_of_payment = Amount_of_payment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, day, month, year, Amount_of_payment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Amount_of_payment == payment.Amount_of_payment && day == payment.day && month == payment.month && year == payment.year && name.equals(payment.name);
    }


    @Override
    public String toString() {
        return String.format("Плательщик: %s Дата: %d.%d.%d Сумма: %d руб. %d коп.", name, day, month, year, (Amount_of_payment/100), (Amount_of_payment%100));
    }
}