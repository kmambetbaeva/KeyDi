import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое значение? ");
        int a = scanner.nextInt();

        System.out.print("Второк значение? ");
        int b = scanner.nextInt();

        System.out.printf("До перестановки: a = %d; b = %d; \n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("После перестановки: a = %d; b = %d;", a, b);
    }
}