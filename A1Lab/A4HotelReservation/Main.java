package A1WorkingWithAbstraction.A1Lab.A4HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(data[0]);
        int numberOfDays = Integer.parseInt(data[1]);
        Season season = Season.valueOf(data[2].toUpperCase());
        DiscountType discount = DiscountType.parseDiscount(data[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay,numberOfDays,season,discount);

        System.out.printf("%.2f",priceCalculator.calculatePrice());

    }
}
