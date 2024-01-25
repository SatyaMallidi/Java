public class OddEven {
    // variable to store the number
    int K;

    // Constructor to the OddEven object with a given number
    public OddEven(int K) {
        this.K = K;
    }

    // Method to find whether the number is odd or even
    public void oddevenfinder() {
        // Checking if the number is even
        if (K % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            // Displaying number is odd
            System.out.println("The given number is Odd");
        }
    }
}
