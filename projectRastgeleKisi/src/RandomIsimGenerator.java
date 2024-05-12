

/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class RandomIsimGenerator {

    private static final String[] COMMON_TURKISH_NAMES = {"Ahmet", "Mehmet", "Mustafa", "Ali", "Hüseyin", 
            "Hasan", "İbrahim", "Ömer", "Furkan", "Osman"};


public static String generateRandomName() {
int index = RandomNumberGenerator.generateRandomInt(0, COMMON_TURKISH_NAMES.length-1);
return COMMON_TURKISH_NAMES[index];
}
}
