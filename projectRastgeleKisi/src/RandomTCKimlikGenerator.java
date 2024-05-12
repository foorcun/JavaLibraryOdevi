

/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class RandomTCKimlikGenerator {
	
	public static String randomTCKimlikGenerator() {
		
		int[] tc = new int[11];
		
		// rule 1: tc ilk hanesi 0 olamaz
		tc[0] = RandomNumberGenerator.generateRandomInt(1, 9);
		
		// rule 2: ilk 9 hanesi random sayilaridan olusur		
		for(int i = 1;i<9;i++ ) {
			tc[i] = RandomNumberGenerator.generateRandomInt(0, 9);
		}
		
		// rule 3:
		// t.c. kimlik numaralarımızın 1. 3. 5. 7. ve 9. hanelerinin toplamının 7 katından,
		// 2. 4. 6. ve 8. hanelerinin toplamı çıkartıldığında, elde edilen sonucun 10'a bölümünden kalan,
		// yani mod10'u bize 10. haneyi verir.
		
		tc[9] = ((tc[0]+tc[2]+tc[4]+tc[6]+tc[8])*7 - (tc[1]+tc[3]+tc[5]+tc[7])) % 10;
		
		 // 1. 2. 3. 4. 5. 6. 7. 8. 9. ve 10. hanelerin toplamından elde edilen sonucun 10'a
		 // bölümünden kalan, yani mod10'u bize 11. haneyi verir.
		
		tc[10] = (tc[0]+tc[1]+tc[2]+tc[3]+tc[4]+tc[5]+tc[6]+tc[7]+tc[8]+tc[9]) % 10;
		
		return arrayToString(tc);
	}
	
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num);
        }
        return sb.toString();
    }

}
