public class main {
    public static void main(String[] args) {
        FinanceReport financeReport = new FinanceReport("Иван Иванович", 4, 7, 2011,
                new Payment("Петр Петрович", 1, 2, 2020, 150004),
                new Payment("Сан-Саныч", 3, 4, 2021, 13924));


        System.out.println("\n\n оригинал:\n");
        System.out.println(financeReport.toString());

        FinanceReport copy = new FinanceReport(financeReport);
        System.out.println("\n\n копия:\n");
        System.out.println(copy.toString());

        copy.get_Payment(0).set_Amount_of_payment(555555);
        System.out.println("\n\n копия с изменением в сумме:\n");
        System.out.println(copy.toString());
    }
}