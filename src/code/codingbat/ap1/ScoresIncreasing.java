package code.codingbat.ap1;

/**
 * Given an array of scores, return true if each score is equal
 * or greater than the one before. The array will be length 2 or more.
 *
 * scoresIncreasing([1, 3, 4]) → true
 * scoresIncreasing([1, 3, 2]) → false
 * scoresIncreasing([1, 1, 4]) → true
 */

public class ScoresIncreasing {
    public static void main(String[] args) {
        System.out.println(scoresIncreasing(1, 3, 4));
        System.out.println(scoresIncreasing(1, 3, 2));
        System.out.println(scoresIncreasing(1, 1, 4));
    }

    public static boolean scoresIncreasing(int... scores) {
        for (int i = 1; i <= scores.length-2; i++) {
            if (scores[i] > scores[i+1])
                return false;
        }
        return true;
    }
}
