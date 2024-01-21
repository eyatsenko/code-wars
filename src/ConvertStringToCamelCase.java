/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case,
also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
*/

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));
    }

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char charI = chars[i];
            if (i == 0 && charI != '-' && charI != '_') {
                sb.append(chars[i]);
            }else if (i != 0 && chars[i - 1] == '_') {
                String charToUpper = String.valueOf(charI).toUpperCase();
                sb.append(charToUpper);
            } else if (i != 0 && charI != '-' && charI != '_' && chars[i - 1] != '-') {
                sb.append(chars[i]);
            } else if (i != 0 && chars[i - 1] == '-') {
                String charToUpper = String.valueOf(charI).toUpperCase();
                sb.append(charToUpper);
            }
        }
        return sb.toString();
    }
}
