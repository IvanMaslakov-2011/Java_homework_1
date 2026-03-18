import java.util.Scanner;

public class Tenth {
    public static void main(String[] args){

        boolean correctValues = false;

        while (!correctValues) {

            System.out.println("Введіть довжину прямокутника: ");
            Scanner length = new Scanner(System.in);
            double lengthValue = length.nextDouble();
            if (lengthValue <= 0) {
                System.out.println("Введіть коректну довжину!");
                continue;
            }
            System.out.println("Введіть ширину прямокутника: ");
            Scanner width = new Scanner(System.in);
            double widthValue = width.nextDouble();

            if ( widthValue <= 0) {
                System.out.println("Введіть коректну ширину!");
                continue;
            }

            double area = lengthValue * widthValue;
            System.out.println("Площа прямокутника: " + area + ";");

            correctValues = true;
        }
    }
}
