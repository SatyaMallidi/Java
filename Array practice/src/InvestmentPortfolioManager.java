import java.util.Scanner;

public class InvestmentPortfolioManager {
    private double[] investments = new double[capacity];
    private int size=0;
    static int capacity;

    public void addInvestment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the new investment: ");
        int value = scanner.nextInt();
        if (size < capacity) {
            investments[size] = value;
            System.out.println("Investment added successfully.");
            size++;
        }
        else {
            System.out.println("Portfolio is full. Cannot add more investments.");
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (int i = 0; i < size; i++) {
            totalValue += investments[i];
        }
        return totalValue;
    }

    public double calculateAverageValue() {
        if (size == 0) {
            return 0; // Avoid division by zero
        }
        return calculateTotalValue() / size;
    }

    public double findHighestValue() {
        if (size == 0) {
            return 0; // No investments in the portfolio
        }

        double max = investments[0];
        for (int i = 1; i < size; i++) {
            if (investments[i] > max) {
                max = investments[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the investment portfolio: ");
        capacity = scanner.nextInt();

        InvestmentPortfolioManager portfolio = new InvestmentPortfolioManager();

        while (true) {
            System.out.println("\n1. Add new investment");
            System.out.println("2. Calculate total portfolio value");
            System.out.println("3. Identify investment with the highest value");
            System.out.println("4. Calculate average value of investments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    portfolio.addInvestment();
                    break;
                case 2:
                    System.out.println("Total portfolio value: $" + portfolio.calculateTotalValue());
                    break;
                case 3:
                    System.out.println("Investment with the highest value: $" + portfolio.findHighestValue());
                    break;
                case 4:
                    System.out.println("Average value of investments: $" + portfolio.calculateAverageValue());
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

