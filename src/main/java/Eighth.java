import java.util.Scanner;

public class Eighth {
    public static void main(){

        System.out.println("Введіть ваше ім'я: ");
        Scanner name = new Scanner(System.in);
        String nameValue = name.next();

        System.out.println("Введіть ваш вік: ");
        Scanner age = new Scanner(System.in);
        int ageValue = age.nextInt();

        System.out.println("Введіть ваш зріст: ");
        Scanner height = new Scanner(System.in);
        double heightValue = height.nextDouble();

        System.out.println("Чи подобається Вам Java? (true/false)");
        Scanner java = new Scanner(System.in);
        boolean javaValue = java.nextBoolean();

        System.out.println("Ім'я: " + nameValue + ";");
        System.out.println("Вік: " + ageValue + ";");
        System.out.println("Зріст: " + heightValue + ";");
        System.out.println("Чи подобається Java: " + javaValue + ";");
    }
}
