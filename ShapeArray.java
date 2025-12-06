// ShapeArray.java
public class ShapeArray {

    public static void main(String[] args) {

        // 1. Instantiate one sphere
        Sphere sphere = new Sphere(3.0);

        // 2. Instantiate one cylinder
        Cylinder cylinder = new Cylinder(2.0, 5.0);

        // 3. Instantiate one cone
        Cone cone = new Cone(2.5, 4.0);

        // 4. Store the class instances into an array named shapeArray
        Shape[] shapeArray = { sphere, cylinder, cone };

        // 5. Loop through the array and print the instance data of each object
        //    using the object's toString method
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
