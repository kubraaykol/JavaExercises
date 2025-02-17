import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		// vize1 %30 vize2 %30 final %40
		// geçme notu 60
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adýnýzý giriniz");
		String isim = scanner.nextLine();
		
		System.out.print("Soyisminizi Girinizi");
		String soyisim = scanner.nextLine();
		
		System.out.print("Dersi Giriniz");
		String dersadi = scanner.nextLine();
		
		System.out.print("vize1 notunuzu giriniz");
		double vize1 = scanner.nextDouble();
		
		System.out.print("vize2 notunuzu giriniz");
		double vize2 = scanner.nextDouble();
		
		System.out.print("Final notunuzu giriniz");
		double finalNotu = scanner.nextDouble();
		
		double sonuc = (vize1*0.3)+(vize2*0.3)+(finalNotu*0.4);
		
		if (sonuc>=60)
			
		{
			System.out.println(isim+" "+soyisim  + dersadi +"dersinde"+sonuc+"ortalamayla geçmiþtir");
		}
		
		else {
			System.out.println("dersten kaldýnýz");
			
		}
		
		}

}
