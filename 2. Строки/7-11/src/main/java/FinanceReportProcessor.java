import java.util.ArrayList;

public class FinanceReportProcessor {

    //получение платежей всех людей, чья фамилия начинается на указанный символ (символ - вход. параметр).
    public static FinanceReport getReport(FinanceReport financeReport, String begin) {
        int day=0, month=0, year=0;

        ArrayList<Payment> arrayList = new ArrayList<>();
        for (int i = 0; i < financeReport.get_Count(); i++) {
            if (financeReport.get_Payment(i).get_name().startsWith(begin)) {
                arrayList.add(financeReport.get_Payment(i));
            }
        }

        return new FinanceReport(financeReport.get_Name(), day, month, year, arrayList.toArray(new Payment[0]));
    }

    //получение всех платежей, размер которых меньше заданной величины.
    public static FinanceReport getPayment(FinanceReport financeReport, int sumMax) {
        int day=0, month=0, year=0;

        ArrayList<Payment> arrayList = new ArrayList<>();
        for (int i = 0; i < financeReport.get_Count(); i++) {
            if (financeReport.get_Payment(i).get_Amount_of_payment() < sumMax) {
                arrayList.add(financeReport.get_Payment(i));
            }
        }
        return new FinanceReport(financeReport.get_Name(), day, month, year, arrayList.toArray(new Payment[0]));
    }
}