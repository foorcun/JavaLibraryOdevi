/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class RastgeleKisi {
	
	private Kisi kisi;

	public RastgeleKisi() {
	this.kisi =	new Kisi.Builder()
		.tcKimlik(new TCKimlik(RandomTCKimlikGenerator.randomTCKimlikGenerator()))
		.isim(new Isim(RandomIsimGenerator.generateRandomName()))
		.soyIsim(new SoyIsim(RandomSoyIsimGenerator.generateRandomSoyIsim()))
		.yas(new Yas(RandomAgeGenerator.generateRandomAge()))
		.telefon(new Telefon(RandomPhoneNumberGenerator.generateRandomPhoneNumber(), RandomPhoneNumberGenerator.generateRandomIMEINumber()))
		.build();
	}

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.kisi.getTcKimlik().getTcKimlik());
		sb.append(" ");
		
		sb.append(this.kisi.getIsim().getIsim());
		sb.append(" ");
		
		sb.append(this.kisi.getSoyIsim().getSoyIsim());
		sb.append(" ");
		
		sb.append(this.kisi.getYas().getYas());
		sb.append(" ");
		
		sb.append(this.kisi.getTelefon().getTelefon());
		sb.append(" ");
		
		sb.append("(");
		sb.append(this.kisi.getTelefon().getImei());
		sb.append(")");
		
		return sb.toString();
	}
	
	
}
