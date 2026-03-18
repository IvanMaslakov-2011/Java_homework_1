import java.util.Scanner;

public class Fifth {
    public static void main() {

        System.out.println("Введіть будь-яке число від 0 до 127:");
        Scanner number = new Scanner(System.in);

        int number_value = number.nextInt();

        boolean symbol_value = false;

        while (!symbol_value) {
            if (number_value >= 0 && number_value <= 127) {
                char symbol = (char) number_value;
                System.out.println("Ваше число відповідає символу: " + symbol);
                symbol_value = true;
            } else {
                System.out.println("Введіть число у діапазоні від 0 до 127");
                number_value = number.nextInt();
            }
        }
    }
}
