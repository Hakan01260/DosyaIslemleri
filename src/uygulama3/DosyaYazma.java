package uygulama3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {

	private PrintWriter printWriter;

	public boolean dosyaOlustur(String dosyaAdi) {

		try {
			printWriter = new PrintWriter("C:/Users/Hakan Erdoðan/Desktop/" + dosyaAdi + ".txt");
			System.out.println("Dosya baþarýlý bir þekilde oluþturuldu.");
			return true;
		} catch (FileNotFoundException e) {

			System.err.println("Hata :" + e);
			System.out.println("Dosya oluþturulurken bir hata oluþtu !");
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

			System.out.println("Dosya baþarýlý bir þekilde kapatýldý.");
			return true;

		} catch (Exception e) {

			System.err.println("Hata :" + e);
			System.out.println("Dosya kapatýlýrken bir hata oluþtu !");
			return false;
		}

	}

}
