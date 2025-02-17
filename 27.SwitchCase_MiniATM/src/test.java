import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
	String islemSecenekleri="Bakiye Görüntüleme için 1"
			+"Para Çekmek için 2 "
			+"Farklý Hesaba Para Yatýrmak için 3"
			+"Çýkýþ Ýçin q Tuþuna Basýnýz";
	
		
		Scanner scanner= new Scanner(System.in);
		
		double bilalBakiye=2450;
		String bilalIBAN="TR1265 0780 127 985 345 7572 13 89";
        String bilalKullanici="bilal12";
        String bilalsifre="123";
		
		double enesBakiye=1200;
		String enesIBAN="TR1265 0780 127 985 345 7572 13 89";
		String enesKullanici="enes55";
		String enessifre="456";
		
		System.out.println("ATM'ye HOÞGELDÝNÝZ");
		System.out.println("Lütfen bilgilerinizi giriniz");
		
		System.out.print("Kullanýcý Adý : ");
		String kullaniciAdi=scanner.nextLine();
		
		System.out.print("Þifre:");
		String sifre=scanner.nextLine();
		
		if (kullaniciAdi.equals("bilal12") && sifre.equals("123"))
		{
			System.out.println("Bilal Çamur Hesabýna Giriþ Yapýldý");
			System.out.println(islemSecenekleri);
			
			System.out.print("Lütfen bir seçim yapýnýz");
			String secim=scanner.nextLine();
			
			switch(secim)
			{
			case "1":
				System.out.println("Bakiyeniz:"+bilalBakiye);
				break;
				
			case"2":
				System.out.print("Çekmek istediðiniz tutarý giriniz");
				int cekilecekTutar=scanner.nextInt();
				if (bilalBakiye>=cekilecekTutar)
				{
					bilalBakiye-=cekilecekTutar;
					System.out.println("Kalan tutar:" +bilalBakiye);
				}
				else {
					System.out.println("Bakiyenizden fazla para çekemezsiniz");
					
				}
				break;
				
			case "3":
				System.out.print("Ne Kadar Yatýrmak Ýstiyorsunuz:");
				int yatirilacakTutar=scanner.nextInt();
				if (yatirilacakTutar<=bilalBakiye)
				{
					System.out.print("iban giriniz:");
					scanner.nextLine();
					String yatirilacakIBAN=scanner.nextLine();
					if (yatirilacakIBAN.equals(enesIBAN))
					{
						System.out.println("Para Enes Bayram adlý kiþiye yatýrýlýyor");
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
			System.out.println("Enes Bayram Hesabýna Giriþ Yapýldý");
			System.out.println(islemSecenekleri);
				}
		else {
			System.out.println("Kullanýcý adýnýz veya þifreniz hatalý");
			
			
		}
		
	}

}
