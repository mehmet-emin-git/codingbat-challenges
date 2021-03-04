package code.codingbat.warmup2;

/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
 * so "kittens" yields "kien".

 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String result = "";
        // iterate with a step of 4 to hit 0 4 8
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length())
                end = str.length();
            result += str.substring(i, end);
        }

        return result;
    }
}
