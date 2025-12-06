// Shape.java
public abstract class Shape {

    // Abstract methods that each 3D shape must implement
    public abstract double surfaceArea();
    public abstract double volume();

    // Optional: a common toString that subclasses can reuse if they want
    @Override
    public String toString() {
        return String.format("Surface Area: %.2f, Volume: %.2f",
                             surfaceArea(), volume());
    }
}
