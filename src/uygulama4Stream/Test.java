package uygulama4Stream;

public class Test {
	
	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci("Hakan", "Erdo�an", 1999, "215256");
		Ogrenci ogrenci2 = new Ogrenci("O�uzhan", "Elma", 2002, "325378");
		Ogrenci ogrenci3 = new Ogrenci("Ferhat", "Y�ld�z", 1994, "568745");
		
		DosyaYazma dosyaYazma = new DosyaYazma();
		
		dosyaYazma.dosyaOlusturma("ogrenciler");
		
		dosyaYazma.dosyaOgrenciKaydet(ogrenci3);
		dosyaYazma.dosyaOgrenciKaydet(ogrenci2);
		dosyaYazma.dosyaOgrenciKaydet(ogrenci1);
		
		DosyaOkuma dosyaOkuma = new DosyaOkuma();
		
		dosyaOkuma.dosyayiOku("ogrenciler");		
		dosyaOkuma.dosyaOku();
		dosyaOkuma.dosyaOkumaKapat();
		
		
	}
	

	
}
