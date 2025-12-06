// Cone.java
public class Cone extends Shape {

    // Attributes
    private double radius;
    private double height;

    // Parameterized constructor
    public Cone(double radius, double height) {
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
    // Slant height for surface area
    private double slantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    // Surface area = πr(r + s)
    @Override
    public double surfaceArea() {
        return Math.PI * radius * (radius + slantHeight());
    }

    // Volume = (1/3)πr²h
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // toString prints surface area and volume
    @Override
    public String toString() {
        return String.format("Cone (r = %.2f, h = %.2f) -> Surface Area: %.2f, Volume: %.2f",
                             radius, height, surfaceArea(), volume());
    }
}
