import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");

        Scanner scanner = new Scanner(System.in);
        int firstnumber = scanner.nextInt();

      System.out.print("Введите второе число: ");
        int secondnumber = scanner.nextInt();

        int sum = firstnumber + secondnumber;
        System.out.printf("%d + %d = %d", firstnumber, secondnumber, sum);
    }
}
