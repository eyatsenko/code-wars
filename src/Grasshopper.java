/*
Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
Use conditionals to return the proper message:
case	return
name equals owner	'Hello boss'
otherwise	'Hello guest'

*/

public class Grasshopper {
    public static void main(String[] args) {
        System.out.println(greet("edik", "eddik"));
    }

    static String greet(String name, String owner) {
        if (name.equals(owner)){
            return "Hello boss";
        } else return "Hello guest";
    }
}
