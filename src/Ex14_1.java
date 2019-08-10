import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter width: ");
        double width = scanner.nextDouble();
        System.out.print("enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your retangle : " + rectangle.disPlay());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Primeter = " +rectangle.getPrimeter());
    }
}
