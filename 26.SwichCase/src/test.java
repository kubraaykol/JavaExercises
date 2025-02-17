import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//Haftanýn Günleri
		
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		
		switch (sayi) {
		case 1:
			System.out.println("Pazartesi");
			break;
			
		case 2:
			System.out.println("Salý");
			break;
			
		case 3 :
			System.out.println("Çarþamba");
			break;
			
		case 4 :
			System.out.println("Perþembe");
			break;
			
		case 5:
			System.out.println("Cuma");
			break;
			
		case 6:
			System.out.println("Cumartesi");
			break;
			
		case 7:
			System.out.println("Pazar");
			break;
			
			default:
				System.out.println("Lütfen 1 ile 7 arasýnda bir sayý giriniz");
		
		}

	}

}
