package uygulama5BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Hakan Erdoðan/Desktop/deneme.txt"))) {

			String satir;

			while ((satir = bufferedReader.readLine()) != null) {

				System.out.println(satir);
			}

		} catch (IOException e) {

			System.err.println("Hata :" + e);

		}

	}

}
