package uygulama3;

public class Ogrenci {

	private String adi;
	private String soyadi;
	private int dogulYili;
	private String okulNumarasi;

	public Ogrenci(String adi, String soyadi, int dogulYili, String okulNumarasi) {

		this.adi = adi;
		this.soyadi = soyadi;
		this.dogulYili = dogulYili;
		this.okulNumarasi = okulNumarasi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getDogulYili() {
		return dogulYili;
	}

	public void setDogulYili(int dogulYili) {
		this.dogulYili = dogulYili;
	}

	public String getOkulNumarasi() {
		return okulNumarasi;
	}

	public void setOkulNumarasi(String okulNumarasi) {
		this.okulNumarasi = okulNumarasi;
	}

	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", dogulYili=" + dogulYili + ", okulNumarasi="
				+ okulNumarasi + "]";
	}

}
