import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
	String islemSecenekleri="Bakiye G�r�nt�leme i�in 1"
			+"Para �ekmek i�in 2 "
			+"Farkl� Hesaba Para Yat�rmak i�in 3"
			+"��k�� ��in q Tu�una Bas�n�z";
	
		
		Scanner scanner= new Scanner(System.in);
		
		double bilalBakiye=2450;
		String bilalIBAN="TR1265 0780 127 985 345 7572 13 89";
        String bilalKullanici="bilal12";
        String bilalsifre="123";
		
		double enesBakiye=1200;
		String enesIBAN="TR1265 0780 127 985 345 7572 13 89";
		String enesKullanici="enes55";
		String enessifre="456";
		
		System.out.println("ATM'ye HO�GELD�N�Z");
		System.out.println("L�tfen bilgilerinizi giriniz");
		
		System.out.print("Kullan�c� Ad� : ");
		String kullaniciAdi=scanner.nextLine();
		
		System.out.print("�ifre:");
		String sifre=scanner.nextLine();
		
		if (kullaniciAdi.equals("bilal12") && sifre.equals("123"))
		{
			System.out.println("Bilal �amur Hesab�na Giri� Yap�ld�");
			System.out.println(islemSecenekleri);
			
			System.out.print("L�tfen bir se�im yap�n�z");
			String secim=scanner.nextLine();
			
			switch(secim)
			{
			case "1":
				System.out.println("Bakiyeniz:"+bilalBakiye);
				break;
				
			case"2":
				System.out.print("�ekmek istedi�iniz tutar� giriniz");
				int cekilecekTutar=scanner.nextInt();
				if (bilalBakiye>=cekilecekTutar)
				{
					bilalBakiye-=cekilecekTutar;
					System.out.println("Kalan tutar:" +bilalBakiye);
				}
				else {
					System.out.println("Bakiyenizden fazla para �ekemezsiniz");
					
				}
				break;
				
			case "3":
				System.out.print("Ne Kadar Yat�rmak �stiyorsunuz:");
				int yatirilacakTutar=scanner.nextInt();
				if (yatirilacakTutar<=bilalBakiye)
				{
					System.out.print("iban giriniz:");
					scanner.nextLine();
					String yatirilacakIBAN=scanner.nextLine();
					if (yatirilacakIBAN.equals(enesIBAN))
					{
						System.out.println("Para Enes Bayram adl� ki�iye yat�r�l�yor");
						bilalBakiye-=yatirilacakTutar;
						enesBakiye+=yatirilacakTutar;
						
						System.out.println("Bakiyeniz : "+bilalBakiye);
						System.out.println("Enes Bakiye : " +enesBakiye);
						
					}
					
				}
				break;
				
			}
			
		}
		else if (kullaniciAdi.equals("enes55") && sifre.equals("456"))
				{
			System.out.println("Enes Bayram Hesab�na Giri� Yap�ld�");
			System.out.println(islemSecenekleri);
				}
		else {
			System.out.println("Kullan�c� ad�n�z veya �ifreniz hatal�");
			
			
		}
		
	}

}
