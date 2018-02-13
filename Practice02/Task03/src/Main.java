import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырёхзначное число? ");
        int a = scanner.nextInt();
        int sum = a/100/10 + a/100%10 + a%100/10 + a%10;

        System.out.printf("Сумма всех цифр числа %d равна %d", a, sum);
    }
}
