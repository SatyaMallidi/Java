// Circle class
public class Circle {
    // variable radius of the circle
    int r;

    // Constructor Circle
    public Circle(int r) {
        this.r = r;
    }

    // Method area of the circle
    public void Area() {
        // Formula for area of a circle: π * r * r
        double Area = Math.PI * r * r;
        System.out.println("The Area of circle is: " + Area);
    }

    // Method perimeter of the circle
    public void Perimeter() {
        // Formula for perimeter of a circle: 2 * π * r
        double Perimeter = 2 * Math.PI * r;
        System.out.println("The Perimeter of circle is: " + Perimeter);
    }
}
