import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1. Individual\n2. Company");
            System.out.print("Choose taxpayer type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter income: ");
            double income = sc.nextDouble();

            TaxUtil.validateIncome(income);

            AbstractTaxPayer taxpayer;

            if (choice == 1) {
                taxpayer = new Individual(name, income);
            } else if (choice == 2) {
                taxpayer = new Company(name, income);
            } else {
                throw new IllegalArgumentException("Invalid choice!");
            }

            double tax = taxpayer.calculateTax();
            taxpayer.printTax(tax);

        } catch (InvalidIncomeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution complete.");
        }
    }
}