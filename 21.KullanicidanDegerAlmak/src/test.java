import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		//Kullanýcýdan deðer alma nasýl yapýlýr?
		// scanner
		
		/*
		 nextLine() -> String
		 nextInt() -> Integer
		 nextByte() -> Byte
		 nextFloat() -> Float
		 nextDouble -> Double
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz");
		
		String isim = scanner.nextLine();
		
		System.out.println("Soyadýnýzý giriniz");
		
		String soyisim = scanner.nextLine();
		
		System.out.println("Adýnýz ve Soyadýnýz :" +isim  +soyisim);
		

	}

}
