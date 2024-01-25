// Main class to demonstrate the usage of given classes
public class Main {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle Satya = new Circle(5);

        // Creating a FloatCircle object
        FloatCircle satya = new FloatCircle(5.5f);

        // Creating an OddEven object
        OddEven M = new OddEven(5);

        // area and perimeter of the Circle
        Satya.Area();
        Satya.Perimeter();

        // area and perimeter of the FloatCircle
        satya.Area();
        satya.Perimeter();

        // Finding whether the number is odd or even
        M.oddevenfinder();
    }
}
