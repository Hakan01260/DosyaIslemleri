package uygulama3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {

	private PrintWriter printWriter;

	public boolean dosyaOlustur(String dosyaAdi) {

		try {
			printWriter = new PrintWriter("C:/Users/Hakan Erdo�an/Desktop/" + dosyaAdi + ".txt");
			System.out.println("Dosya ba�ar�l� bir �ekilde olu�turuldu.");
			return true;
		} catch (FileNotFoundException e) {

			System.err.println("Hata :" + e);
			System.out.println("Dosya olu�turulurken bir hata olu�tu !");
			return false;

		}
	}

	public void ogrenciKaydet(Ogrenci ogrenci) {

		String adi = ogrenci.getAdi();
		String soyadi = ogrenci.getSoyadi();
		int dogumYili = ogrenci.getDogulYili();
		String okulNumarasi = ogrenci.getOkulNumarasi();

		printWriter.println(adi + " " + soyadi + " " + dogumYili + " " + okulNumarasi);

	}

	public boolean dosyaYazmayiKapat() {

		try {

			printWriter.close();

			System.out.println("Dosya ba�ar�l� bir �ekilde kapat�ld�.");
			return true;

		} catch (Exception e) {

			System.err.println("Hata :" + e);
			System.out.println("Dosya kapat�l�rken bir hata olu�tu !");
			return false;
		}

	}

}
