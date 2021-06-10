/*
You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.
Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.
For example, update_light('green') should return 'yellow'.
*/
public class ThankfulLogicDrillsTrafficLight {
    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }
    static String result = "green";

    public static String updateLight(String current) {

        switch (current) {
            case "red" :
                result = "green";
                break;
            case "yellow" :
                if (result.equals("green")){
                    result = "green";
                } else result = "red";
                break;
            case "green" :
                result = "yellow";
            break;
        }
        return result;
    }
}
