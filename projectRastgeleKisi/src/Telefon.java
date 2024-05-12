/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class Telefon {
	
	private String telefon;
	
	private String imei;


	public Telefon(String randomPhoneNumber, String randomIMEINumber) {
		this.telefon = randomPhoneNumber;
		this.imei = randomIMEINumber;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
	
	

}
