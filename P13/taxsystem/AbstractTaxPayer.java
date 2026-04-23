public abstract class AbstractTaxPayer implements Taxable, Surchargeable {
    protected String name;
    protected double income;

    public AbstractTaxPayer(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public abstract double calculateTax();

    // Resolving ambiguity between interfaces
    @Override
    public void printTax(double tax) {
        Taxable.super.printTax(tax); // explicitly choosing one
        System.out.println("Final Tax (with cess): " + (tax + Taxable.cess(tax)));
    }
}