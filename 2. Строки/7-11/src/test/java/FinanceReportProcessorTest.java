import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FinanceReportProcessorTest {
    FinanceReport financeReport = new FinanceReport("Pepper", 4, 7, 2011,
            new Payment("Steve", 1, 2, 2020, 150004),
            new Payment("Peter", 3, 4, 2021, 13924),
            new Payment("Tony'", 5, 6, 2022, 129723));

    @Test()
    public void test_getReport() {
        //1 имя начинается на P - Peter
        FinanceReport result1 = FinanceReportProcessor.getReport(financeReport, "P");
        assertEquals(result1.get_Arr().length, 1);
        //0 имен начинаются на z
        FinanceReport result2 = FinanceReportProcessor.getReport(financeReport, "z");
        assertEquals(result2.get_Arr().length, 0);
    }

    @Test()
    public void test_getPayment() {
        FinanceReport result = FinanceReportProcessor.getPayment(financeReport, 130000);
        assertEquals(result.get_Arr().length, 2);
    }
}