import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lessons = scanner.nextInt();

        int hours = 9 + ((lessons*45+lessons/2*5+(lessons-1)/2*15)/60%24);
        int minutes = (lessons*45+lessons/2*5+(lessons-1)/2*15)%60;

        System.out.printf("%02d %02d", hours, minutes);
    }
}
