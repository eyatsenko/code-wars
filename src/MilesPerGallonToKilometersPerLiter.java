/*
Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.
Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).
Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.
Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres
*/

public class MilesPerGallonToKilometersPerLiter {
    public static void main(String[] args) {
        System.out.println(mpgToKPM(25));
    }

    public static float mpgToKPM(final float mpg) {
        float result = 0;
        double miles = mpg;
        double gallons = 1;
        double milesPerGallon = miles / gallons;


        double kilometers = miles * 1.609344;
        double litres = gallons * 4.54609188;

        result = (float) ((float) kilometers / litres);

        String resultSt = String.format("%.2f", result);

        result = Float.parseFloat(resultSt);

        return result;
    }
}
