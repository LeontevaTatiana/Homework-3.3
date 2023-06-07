public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int myAmountOfCredit = 1_000_000;
        double myInterestRate = 9.99;
        int myLoanPeriodInMonths = 36;
        int monthlyPayment = service.calculate(myAmountOfCredit, myInterestRate, myLoanPeriodInMonths);
        System.out.println(monthlyPayment);
    }
}