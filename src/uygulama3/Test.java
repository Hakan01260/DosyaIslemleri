package uygulama3;

public class Test {
	
	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci("Hakan", "Erdo�an", 1999, "215256");
		Ogrenci ogrenci2 = new Ogrenci("O�uzhan", "Elma", 2002, "325378");
		
		DosyaYazma dosyaYazma = new DosyaYazma();
		
		dosyaYazma.dosyaOlustur("ogrenciler");
		
		dosyaYazma.ogrenciKaydet(ogrenci1);
		dosyaYazma.ogrenciKaydet(ogrenci2);
		
		dosyaYazma.dosyaYazmayiKapat();
		
		System.out.println();
		System.out.println("Dosya Okuma ��lemleri :");
		
		DosyaOkuma dosyaOkuma = new DosyaOkuma();
		
		dosyaOkuma.okunacakDosya("ogrenciler");
		dosyaOkuma.dosyaOku();		
		dosyaOkuma.dosyaOkumayiKapat();
		
		
	
	}
	

	
}
