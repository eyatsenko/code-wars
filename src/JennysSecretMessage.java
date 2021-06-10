/*
Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny,
and would like to greet him slightly different. She added a special case to her function, but she made a mistake.
Can you help her?
*/
public class JennysSecretMessage {
    public static void main(String[] args) {
        System.out.println(greet("Johnny"));
    }

    public static String greet(String name) {

        String result =  String.format("Hello, %s!", name);

        if(name.equals("Johnny")){
            result = "Hello, my love!";
        }
        return result;
    }
}
