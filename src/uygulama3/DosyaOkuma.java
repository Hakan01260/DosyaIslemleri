package uygulama3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {

	Scanner scan;

	public void okunacakDosya(String dosyaAdi) {

		try {

			scan = new Scanner(new File("C:/Users/Hakan Erdoðan/Desktop/" + dosyaAdi + ".txt"));

		} catch (FileNotFoundException e) {

			System.err.println("Hata :" + e);
		}

	}

	public void dosyaOku() {

		while (scan.hasNextLine()) {

			System.out.println(scan.nextLine());

		}

	}

	public void dosyaOkumayiKapat() {

		scan.close();
	}

}
