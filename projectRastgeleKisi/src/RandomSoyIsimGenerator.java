

/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class RandomSoyIsimGenerator {

    private static final String[] COMMON_TURKISH_SUR_NAMES = {"YILMAZ", "KAYA", "BAKIR", "ÇELİK", "ŞAHİN", 
            "YILDIRM", "ÖZTÜRK", "ÖZDEMİR", "KAMACI", "KARAKAYA"};
    
    
    public static String generateRandomSoyIsim() {
    	int index = RandomNumberGenerator.generateRandomInt(0, COMMON_TURKISH_SUR_NAMES.length-1);
    	return COMMON_TURKISH_SUR_NAMES[index];
    	}
}
