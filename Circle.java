public class Circle {
    private double radius;   // private access modifier

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    // Compute Area
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
