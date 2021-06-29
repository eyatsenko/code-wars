/*
In this kata you will have to write a function that takes litres and pricePerLitre as arguments.
Purchases of 2 or more litres get a discount of 5 cents per litre, purchases of 4 or more litres get a discount of 10 cents per litre, and so on every two litres,
up to a maximum discount of 25 cents per litre. But total discount per litre cannot be more than 25 cents.
Return the toal cost rounded to 2 decimal places. Also you can guess that there will not be negative or non-numeric inputs.

*/

public class FuelCalculator {
    public static void main(String[] args) {
        System.out.println(fuelPrice(5, 1.23d));
    }

    public static double fuelPrice(int litres, double pricePerLitre) {

        double purchase = 0;
        double finalPrice;
        double tmp = litres;

        while (tmp >= 0) {
            if (tmp - 2 < 0) {
                break;
            }
            tmp -= 2;
            purchase += 5;
        }

        finalPrice = pricePerLitre - purchase;

        return litres * finalPrice;
    }
}
