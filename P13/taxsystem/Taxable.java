public interface Taxable {
    double calculateTax();

    default void printTax(double tax) {
        log("Tax calculated: " + tax);
    }

    private void log(String msg) {
        System.out.println("[Taxable Log] " + msg);
    }

    static double cess(double tax) {
        return tax * 0.04; // 4% cess
    }
}