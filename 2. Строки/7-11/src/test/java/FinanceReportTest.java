import org.junit.Test;
import static org.junit.Assert.*;

public class FinanceReportTest {
    FinanceReport financeReport = new FinanceReport("Pepper", 4, 7, 2011,
            new Payment("Steve", 1, 2, 2020, 150004),
            new Payment("Peter", 3, 4, 2021, 13924),
            new Payment("Tony'", 5, 6, 2022, 129723));

    //индекс выбранного платежа больше, чем размер массива платежей
    @Test(expected = IndexOutOfBoundsException.class)
    public void testInvalidIndex() {
        financeReport.get_Payment(financeReport.get_Arr().length + 1);
    }

    @Test
    public void testCopy_1() {
        //создали отчет copy равный отчету financeReport
        FinanceReport copy = new FinanceReport(financeReport);
        //изменили в отчете copy платеж с индексом 0
        copy.set_Payment(0, new Payment("name", 0,0,0,11));

        assertNotEquals(copy, financeReport);
    }

    @Test
    public void testCopy_2() {
        //создали отчет copy равный отчету financeReport
        FinanceReport copy = new FinanceReport(financeReport);
        //ожидаем, что платеж(copy) с индексом 0 будет равен платежу(financeReport) с индексом 0

        assertEquals(copy, financeReport);
    }

    @Test
    public void test_copy_3() {
        //создали отчет copy равный отчету financeReport
        FinanceReport copy = new FinanceReport(financeReport);

        //поменяли Amount_of_payment в financeReport, в copy это меняться не должно
        financeReport.get_Payment(0).set_Amount_of_payment(555555);

        assertNotEquals(copy, financeReport);
    }
}