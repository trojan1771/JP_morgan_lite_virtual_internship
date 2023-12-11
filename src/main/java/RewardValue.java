import java.util.Scanner;
public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with miles value.");
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash to miles at a rate of 0.0035
    private double convertCashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Convert miles to cash at a rate of 0.0035
    private double convertMilesToCash(double miles) {
        return miles * 0.0035;
    }

    public static void main(String[] args) {
        // Example usage
        RewardValue reward1 = new RewardValue(100.0); // Construct with cash value
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        RewardValue reward2 = new RewardValue(500.0, true); // Construct with miles value
        System.out.println("Cash Value: " + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }
}
