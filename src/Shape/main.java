package Shape;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create your triangle.\nEnter side1, side2, side3: ");
        double side1= scanner.nextDouble();
        double side2= scanner.nextDouble();
        double side3= scanner.nextDouble();
        System.out.println("Enter triangle color: ");
        String color = scanner.next();
        Triangle t1 = new Triangle(side1,side2,side3);
        t1.setColor(color);
        System.out.println(t1.toString());
    }
}
