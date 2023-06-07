public class CreditPaymentService {
    public int calculate(int amountOfCredit, double interestRate, int loanPeriodInMonths) {
        int result;
        double payment;
        double pathOne;
        double pathTwo;
        double interestRatePerMonth;
        interestRatePerMonth = interestRate / (100*12);
        pathOne = interestRatePerMonth * Math.pow((1+interestRatePerMonth),loanPeriodInMonths);
        pathTwo = (Math.pow(1 + interestRatePerMonth, loanPeriodInMonths)) - 1;
        payment = amountOfCredit * pathOne / pathTwo;
        result = (int)payment;
        return result;
    }
}
