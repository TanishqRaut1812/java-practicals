public interface Surchargeable {
    double calculateTax();

    default void printTax(double tax) {
        System.out.println("[Surchargeable] Tax: " + tax);
    }
}