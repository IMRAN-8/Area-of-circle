import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for radius
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Create object using constructor
        Circle c = new Circle(r);

        // Display results
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.computeArea());
    }
}
