import java.util.Scanner;

public class Ninth {
    public static void main(){
        System.out.println("Введіть ціле число: ");
        Scanner number = new Scanner(System.in);
        int numberValue = number.nextInt();

        System.out.println("Для числа " + numberValue + ", наступним є: " + (numberValue + 1) + ", а попереднім: " + (numberValue - 1) + ";");
    }

}
