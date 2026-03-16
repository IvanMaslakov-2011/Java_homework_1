import java.util.Scanner;

public class First {

    public static void main() {

    System.out.println("Введіть кількість гривень:");
    Scanner uah_value = new Scanner(System.in);
    int uah = uah_value.nextInt();

    System.out.println("Введіть курс доллара:");
    Scanner usd_value = new Scanner(System.in);
    double usd = usd_value.nextDouble();

    System.out.println("Ваші доллари: $"  + (uah / usd));
    }

}
