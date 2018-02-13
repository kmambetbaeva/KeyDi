import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();

        System.out.printf("%d %d", min/60%24, min%60);
    }
}
