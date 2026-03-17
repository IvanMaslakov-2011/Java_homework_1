import java.util.Scanner;

public class Fourth {

    public static void main(){

        System.out.println("Введіть ділене:");
        Scanner a = new Scanner(System.in);
        int a_value = a.nextInt();

        System.out.println("Введіть дільник:");
        Scanner b = new Scanner((System.in));
        int b_value = b.nextInt();

        int result = a_value / b_value;
        int mod = a_value % b_value;

        System.out.println("Цілочисельна частка: " + result + " Остача від ділення: " + mod);


    }
}
