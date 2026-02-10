import java.util.Scanner;
public class decimalToNumberSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int number = sc.nextInt();
String binary = Integer.toBinaryString(number);
String octal = Integer.toOctalString(number);
String hexadecimal = Integer.toHexString(number);
System.out.println("Decimal " + number + ":");
System.out.println("Binary: " + binary);
System.out.println("Octal: " + octal);
System.out.println("Hexadecimal: " + hexadecimal);
}
}