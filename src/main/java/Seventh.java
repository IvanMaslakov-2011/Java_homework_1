import java.util.Scanner;

public class Seventh {
    public static void main() {
        System.out.println("Введіть число $a$: ");
        Scanner a = new Scanner(System.in);

        int aValue = a.nextInt();

        System.out.println("Введіть число $b$: ");
        Scanner b = new Scanner(System.in);

        int bValue = b.nextInt();

        aValue = aValue - bValue;
        bValue = bValue + aValue;
        aValue = bValue - aValue;

        System.out.println("Число $a$: " + aValue + " Число $b$: " + bValue);

    }
}
