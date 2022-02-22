package uglumala1PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaIslemleri {
		
	public static void main(String[] args) {
		
		try {
			PrintWriter yazici = new PrintWriter("C:/Users/Hakan Erdoðan/Desktop/metin.txt");
			
			yazici.println("Merhaba Hakan");
			yazici.println("Neler yapýyorsun ?");
			
			
			
			yazici.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Hata :" + e);
		}
	}
}
