import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		//Kullan�c�dan de�er alma nas�l yap�l�r?
		// scanner
		
		/*
		 nextLine() -> String
		 nextInt() -> Integer
		 nextByte() -> Byte
		 nextFloat() -> Float
		 nextDouble -> Double
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ad�n�z� giriniz");
		
		String isim = scanner.nextLine();
		
		System.out.println("Soyad�n�z� giriniz");
		
		String soyisim = scanner.nextLine();
		
		System.out.println("Ad�n�z ve Soyad�n�z :" +isim  +soyisim);
		

	}

}
