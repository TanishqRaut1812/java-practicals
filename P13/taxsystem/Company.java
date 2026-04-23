public final class Company extends AbstractTaxPayer {

    public Company(String name, double income) {
        super(name, income);
    }

    @Override
    public double calculateTax() {
        return income * 0.25; // flat corporate tax
    }
}