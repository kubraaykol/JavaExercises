
public class test {

	public static void main(String[] args) {

		/* 
		  Biri kuruyemi��i toptanc�dan 
		  
		  12 kg leblebi kilosunu 3,5 TLden
		  25 kg f�nd�k kilosunu 15,7 TLden
		  40 kg badem kilosunu 22 TLden
		  
		  alm��t�r
		  
		  bu �r�nleri satarken
		  
		   leblebi %50 karla
		   f�nd�k %40 karla
		   badem %60 karla satm��t�r
		   
		   kuruyemi��i o g�n kazand��� parayla kiras�n� �demek istemektedir 
		   
		   kira tutar� 500 TL,
		   kazand��� para 500 Tlden y�ksek ise �deyebilir de�il ise �deyemez yaz�l� program
		  
		  
		  */
	
		double leblebi=3.5;
		double findik=15.7;
		double badem =22;
		
		double maliyet= (leblebi*12)+(findik*25)+(badem*40);
		double satis= ((leblebi*1.5)*12)+((findik*1.4)*25)+((badem*1.6)*40);
		double kaar=satis-maliyet;
		if (kaar>500)
		{
			System.out.println("Kiray� �deyebilirsiniz");
			
		}
		else {
			System.out.println("Yeterli bakiyeniz nulunmamaktad�r");
		}
		
		System.out.println("Maliyet Tutar" +maliyet);
		System.out.println("Sat�� Tutar" +satis);
		System.out.println("Kazan. Tutar" +kaar);
	}
	

}
