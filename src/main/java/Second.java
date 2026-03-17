import java.util.Scanner;

public class Second {

    public static void main() {

        System.out.println("Введіть кількість годин:");
        Scanner hours = new Scanner(System.in);
        int hours_value = hours.nextInt();

        System.out.println("Введіть кількість хвилин:");
        Scanner minutes = new Scanner(System.in);
        int minutes_value = minutes.nextInt();

        System.out.println("Введіть кількість секунд:");
        Scanner seconds = new Scanner(System.in);
        int seconds_value = seconds.nextInt();

        int all_time = seconds_value + (hours_value * 3600) + (minutes_value * 60);
        System.out.println("Загальна кількість секунд: " + all_time + "s");
    }
}
