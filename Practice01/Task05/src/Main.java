import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Введите значение стороны a: ");
       int sidea = scanner.nextInt();

        System.out.print("Введите значение стороны b: ");
        int sideb = scanner.nextInt();

        System.out.print("Введите значение стороны c: ");
        int sidec = scanner.nextInt();

        int V = sidea*sideb*sidec;

        System.out.printf("Объем параллелепипеда (%d x %d x %d) равен %d", sidea, sideb, sidec, V);
    }
}
