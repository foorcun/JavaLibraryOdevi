/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

public class Kisi {
	
	private final TCKimlik tcKimlik;
    private final Isim isim;
    private final SoyIsim soyIsim;
    private final Yas yas;
    private final Telefon telefon;

    private Kisi(Builder builder) {
        this.tcKimlik = builder.tcKimlik;
        this.isim = builder.isim;
        this.soyIsim = builder.soyIsim;
        this.yas = builder.yas;
        this.telefon = builder.telefon;
    }

    public static class Builder {
        private TCKimlik tcKimlik;
        private Isim isim;
        private SoyIsim soyIsim;
        private Yas yas;
        private Telefon telefon;

        public Builder() {
            // Varsayılan değerler
        }

        public Builder tcKimlik(TCKimlik tcKimlik) {
            this.tcKimlik = tcKimlik;
            return this;
        }

        public Builder isim(Isim isim) {
            this.isim = isim;
            return this;
        }

        public Builder soyIsim(SoyIsim soyIsim) {
            this.soyIsim = soyIsim;
            return this;
        }

        public Builder yas(Yas yas) {
            this.yas = yas;
            return this;
        }

        public Builder telefon(Telefon telefon) {
            this.telefon = telefon;
            return this;
        }

        public Kisi build() {
            return new Kisi(this);
        }
    }

	public TCKimlik getTcKimlik() {
		return tcKimlik;
	}

	public Isim getIsim() {
		return isim;
	}

	public SoyIsim getSoyIsim() {
		return soyIsim;
	}

	public Yas getYas() {
		return yas;
	}

	public Telefon getTelefon() {
		return telefon;
	}
	

}