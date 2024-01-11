public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Edik", "Vasya", "Petro", "Max", "Olga"));
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        String result;
        switch (names.length) {
            case 0:
                result = "no one likes this";
                break;
            case 1:
                result = names[0] + " likes this";
                break;
            case 2:
                result = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                result = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }

        return result;
    }


    public static String whoLikesIt2(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}
