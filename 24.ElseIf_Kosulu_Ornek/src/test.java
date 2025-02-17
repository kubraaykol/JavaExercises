import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		 // 80-100 A
		//60-80 B
		//50-60 C
		//40-49 F kaldý
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("vize notunuzu giriniz");
		double vize1 = scanner.nextDouble();
		
		System.out.print("ikinci vizenizi giriniz");
		double vize2 = scanner.nextDouble();
		
		System.out.print("final notunuzu giriniz");
		double finalnot = scanner.nextDouble();
		
		double sonuc= (vize1*0.3)+(vize2*0.3)+(finalnot*0.4);
		
		if (sonuc>=80 && sonuc<=100)
		{
			System.out.println("Notunuz A");
			
		}
		
		else if (sonuc>=60 && sonuc<=80)
		{
			System.out.println("Notunuz B");
			
		}
		else if (sonuc>=50 && sonuc<=60)
		{
			System.out.println("Notunuz C");
		}
		else if (sonuc>=40 && sonuc<=49)
		{
			System.out.println("Notunuz F ---- Kaldýnýz");
			
		}
		
		else {
			System.out.println("Notunuz Hiçbir Deðer Aralýðýnda Deðildir");
		}
	}	

}
