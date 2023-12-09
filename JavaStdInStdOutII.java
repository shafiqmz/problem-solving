import java.util.Scanner;

public class JavaStdInStdOutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        String stringValue = scanner.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);

        scanner.close();
    }
}
