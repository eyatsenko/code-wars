/*
I would like to be able to pass an array with two elements to my swapValues function to swap the values. However it appears that the values aren't changing.
Can you figure out what's wrong here?
*/

public class SwapValues {
    public static void main(String[] args) {
        Object [] array = new Object[] {1, 2};

        SwapValues swapValues = new SwapValues(array);
        for (Object o : array) {
            System.out.println(o);
        }
    }

    public static Object[] arguments;

    public SwapValues (Object[] args){
        arguments=args;
    }

    public static void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
    }
}
