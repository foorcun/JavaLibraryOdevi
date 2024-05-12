

/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

import java.util.Random;

public class RandomNumberGenerator {

    private static final Random RANDOM = new Random();

    public static int generateRandomInt(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max, minden küçük olamaz.");
        }
        return RANDOM.nextInt((max - min) + 1) + min;
    }

}
