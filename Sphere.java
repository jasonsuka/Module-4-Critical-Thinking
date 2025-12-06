// Sphere.java
public class Sphere extends Shape {

    // Attribute
    private double radius;

    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Getters/setters if you want them
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract methods
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // toString prints surface area and volume
    @Override
    public String toString() {
        return String.format("Sphere (r = %.2f) -> Surface Area: %.2f, Volume: %.2f",
                             radius, surfaceArea(), volume());
    }
}
