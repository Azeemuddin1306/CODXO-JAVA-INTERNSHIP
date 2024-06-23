import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();
    
    static {
        // Exchange rates with respect to USD
        exchangeRates.put("INR", 82.00);  // 1 USD = 82.00 INR
        exchangeRates.put("CNY", 7.20);   // 1 USD = 7.20 CNY
        exchangeRates.put("USD", 1.00);   // 1 USD = 1.00 USD
        exchangeRates.put("KWD", 0.31);   // 1 USD = 0.31 KWD
        exchangeRates.put("PKR", 286.00); // 1 USD = 286.00 PKR
        exchangeRates.put("NPR", 132.00); // 1 USD = 132.00 NPR
        exchangeRates.put("LKR", 303.00); // 1 USD = 303.00 LKR
    }
    
    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code");
        }
        
        double amountInUSD = amount / exchangeRates.get(fromCurrency);
        return amountInUSD * exchangeRates.get(toCurrency);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t\tWelcome to Currency Converter");
        
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter the source currency code India (INR), China (CNY), USA (USD), Kuwait (KWD), Pakistan (PKR), Nepal (NPR), and Sri Lanka (LKR): ");
        String fromCurrency = scanner.next().toUpperCase();
        
        System.out.print("Enter the target currency code (INR, CNY, USD, KWD, PKR, NPR, LKR): ");
        String toCurrency = scanner.next().toUpperCase();
        
        try {
            double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
            System.out.printf("\n%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}