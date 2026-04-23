public class TaxUtil {
    public static void validateIncome(double income) throws InvalidIncomeException {
        if (income < 0) {
            throw new InvalidIncomeException("Income cannot be negative!");
        }
    }
}