package uygulama4Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DosyaYazma {

	private ObjectOutputStream objectOutputStream;

	public boolean dosyaOlusturma(String dosyaAdi) {

		try {

			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:/Users/Hakan Erdoðan/Desktop/" + dosyaAdi + ".abc");

			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			return true;

		} catch (FileNotFoundException e) {

			System.err.println("FileOutputStream de hata oluþtu.");
			System.err.println("Hata :" + e);

		} catch (IOException e) {

			System.err.println("ObjectOutputStream de hata oluþtu.");
			System.err.println("Hata :" + e);
		}
		return false;

	}

	public void dosyaOgrenciKaydet(Ogrenci ogrenci) {

		try {
			objectOutputStream.writeObject(ogrenci);
		} catch (IOException e) {

			System.err.println("Ogrenci kaydedilirken hata alýndý .");
			System.err.println("Hata :" + e);
		}

	}

	public void dosyaKapat() {

		if (objectOutputStream != null) {

			try {
				objectOutputStream.close();
			} catch (IOException e) {

				System.err.println("objectOutputStream kapanýrken bir hata oluþtu");
				System.err.println("Hata :" + e);
			}
		}

	}

}
