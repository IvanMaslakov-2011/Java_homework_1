import java.util.Scanner;

public class Third {
    public static void main() {
        System.out.println("Введіть вартість першого товару:");
        Scanner price_1 = new Scanner(System.in);
        double price_1_value = price_1.nextDouble();

        System.out.println("Введіть вартість другого товару:");
        Scanner price_2 = new Scanner(System.in);
        double price_2_value = price_2.nextDouble();

        System.out.println("Введіть варітсть третього товару:");
        Scanner price_3 = new Scanner(System.in);
        double price_3_value = price_3.nextDouble();

        double total_value = price_1_value + price_2_value + price_3_value;
        double average_value = total_value / 3;

        System.out.println("Сума: " + total_value + " Середня вартість товарів: " + average_value);
    }
}
