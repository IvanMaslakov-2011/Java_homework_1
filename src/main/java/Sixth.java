import java.util.Scanner;
public class Sixth {
    public static void main() {
        System.out.println("Введіть ціле число: ");
        Scanner Integer = new Scanner(System.in);
        int intValue = Integer.nextInt();

        System.out.println(intValue % 2 == 0 ? "True" : "False");
    }
}
