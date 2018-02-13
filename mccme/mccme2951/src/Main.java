import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = (a*100+b)*n;

        System.out.printf("%d %d", sum/100, sum%100);
    }
}
