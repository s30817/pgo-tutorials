import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz liczbe:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("liczba jest dodatnia");
        } else if (number < 0) {
            System.out.println("liczba jest ujemna");
        } else {
            System.out.println(" liczba jest rowna 0 ");
        }
        scanner.close();
    }
}