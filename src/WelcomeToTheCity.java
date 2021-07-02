/*
Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.

Example:

sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!

Hello, John Smith! Welcome to Phoenix, Arizona!
*/

public class WelcomeToTheCity {
    public static void main(String[] args) {
        System.out.println(sayHello(new String[]{"John", "Smith", "Yatsenko"}, "Phoenix", "Arizona"));
        System.out.println("Hello, John Smith! Welcome to Phoenix, Arizona!");
    }

    public static String sayHello(String[] name, String city, String state) {
        String fullName = "";

        for (int i = 0; i < name.length; i++) {
            fullName +=  name[i];
            if (i != name.length -1){
                fullName += " ";
            }
        }

        return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
    }
}
