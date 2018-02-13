import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение в дюймах? ");
        double inches = scanner.nextDouble();
        double sm = inches*2.54;

        System.out.printf("%.2f дюйм. = %.2f см.", inches, sm);
    }
}
