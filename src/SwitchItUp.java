public class SwitchItUp {
    public static void main(String[] args) {
        System.out.println(switchItUp(3));
    }

    public static String switchItUp(int number)
    {
        String result;
        switch (number){
            case 0: result = "Zero";
            break;
            case 1: result = "One";
            break;
            case 2: result = "Two";
            break;
            case 3: result = "Three";
            break;
            case 4: result = "Four";
            break;
            case 5: result = "Five";
            break;
            case 6: result = "Six";
            break;
            case 7: result = "Seven";
            break;
            case 8: result = "Eight";
            break;
            case 9: result = "Nine";
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return result;
    }
}
