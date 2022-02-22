package uygulama4Stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DosyaOkuma {

	private ObjectInputStream objectInputStream;

	public boolean dosyayiOku(String dosyaAdi) {

		try {

			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/Hakan Erdoðan/Desktop/" + dosyaAdi + ".abc");

			objectInputStream = new ObjectInputStream(fileInputStream);

			return true;
		} catch (FileNotFoundException e) {

			System.err.println("Okunacak dosya bulunamadý .");
			System.err.println("Hata :" + e);
		} catch (IOException e) {

			System.err.println("Dosya açýlýrken bir hata oluþtu .");
			System.err.println("Hata :" + e);
		}

		return false;
	}

	public void dosyaOku() {
		
		
		try {
			
			while(true) {
				Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();
				System.out.println(ogrenci);
			}
		}catch (EOFException e) {
			
			System.out.println("Dosya okuma iþlemi bitti.");
			return;
			
		} catch (ClassNotFoundException e) {
			
			System.err.println("Ogrenci classý bulunamadý .");
			System.err.println("Hata :" + e);
			
		} catch (IOException e) {
			
			System.err.println("Ogrenci nesnesi okunurken bir hata olustu .");
			System.err.println("Hata :" + e);
		}
	}
		
		


	public boolean dosyaOkumaKapat() {

		if (objectInputStream != null) {

			try {
				objectInputStream.close();
			} catch (IOException e) {

				System.err.println("objectInputStream kapanýrken bir hata olustu .");
				System.err.println("Hata :" + e);

				return false;
			}
		}

		return true;
	}

}
