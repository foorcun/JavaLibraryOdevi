

import java.util.Arrays;

/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class RandomPhoneNumberGenerator {
	
	private static final String[] OPERATOR_CODES = {"0507","0544"};
	
	public static String generateRandomPhoneNumber() {
		
		String operatorCode = OPERATOR_CODES[RandomNumberGenerator.generateRandomInt(0, OPERATOR_CODES.length-1)];
		
		String kuyruk = String.valueOf(RandomNumberGenerator.generateRandomInt(0000000,9999999));
		
		return operatorCode + kuyruk;
	}
	
	public static final String generateRandomIMEINumber() {
		
		int[] imei = new int[15];
				
		// rule 1: ilk 14 hanesi random sayilaridan olusur		
		for(int i = 0; i<14; i++) {
			imei[i] = RandomNumberGenerator.generateRandomInt(0, 9);
		}
		
		// rule 2: 15. hane Luhn algoritmasina gore bulunur
		imei[14] = generateCheckDigit(arrayToString(Arrays.copyOfRange(imei, 0, 14)));
		
		return arrayToString(imei);
	}
	
	  private static String arrayToString(int[] array) {
	        StringBuilder sb = new StringBuilder();
	        for (int num : array) {
	            sb.append(num);
	        }
	        return sb.toString();
	    }
	  
	    public static int generateCheckDigit(String number) {
	        int sum = 0;
	        boolean alternate = false;
	        for (int i = number.length() - 1; i >= 0; i--) {
	            int digit = Character.getNumericValue(number.charAt(i));
	            if (alternate) {
	                digit *= 2;
	                if (digit > 9) {
	                    digit = digit - 9;
	                }
	            }
	            sum += digit;
	            alternate = !alternate;
	        }
	        int checkDigit = (sum * 9) % 10;
	        return checkDigit;
	    }

	    public static void main(String[] args) {
	        String number = "12345678901234"; // Your 14-digit number here
	        int checkDigit = generateCheckDigit(number);
	        System.out.println("Generated Check Digit: " + checkDigit);
	    }

}
