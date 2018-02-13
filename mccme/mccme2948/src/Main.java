import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hh = n/3600%24;
        int mm = n/60%60;
        int ss = n%60;

        System.out.printf("%d:%02d:%02d", hh, mm, ss);
    }
}
