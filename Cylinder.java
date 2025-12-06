// Cylinder.java
public class Cylinder extends Shape {

    // Attributes
    private double radius;
    private double height;

    // Parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Implement abstract methods
    // Surface area = 2πr(h + r)
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    // Volume = πr²h
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // toString prints surface area and volume
    @Override
    public String toString() {
        return String.format("Cylinder (r = %.2f, h = %.2f) -> Surface Area: %.2f, Volume: %.2f",
                             radius, height, surfaceArea(), volume());
    }
}
