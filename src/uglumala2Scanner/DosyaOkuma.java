package uglumala2Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {

	public static void main(String[] args) {

		File dosya = new File("C:/Users/Hakan Erdoðan/Desktop/metin.txt");

		try {

			Scanner scan = new Scanner(dosya);

			String metinBelgesi;
			while (scan.hasNextLine()) {

				metinBelgesi = scan.nextLine();
				System.out.println(metinBelgesi);

			}
			
			scan.close();

		} catch (FileNotFoundException e) {

			System.err.println("Hata :" + e);
		}

	}
}
