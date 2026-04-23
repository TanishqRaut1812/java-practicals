public class Individual extends AbstractTaxPayer {

    public Individual(String name, double income) {
        super(name, income);
    }

    @Override
    public double calculateTax() {
        if (income <= 250000) return 0;
        else if (income <= 500000) return income * 0.05;
        else if (income <= 1000000) return income * 0.2;
        else return income * 0.3;
    }
}