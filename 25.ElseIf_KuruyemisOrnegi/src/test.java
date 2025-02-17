
public class test {

	public static void main(String[] args) {

		/* 
		  Biri kuruyemişçi toptancıdan 
		  
		  12 kg leblebi kilosunu 3,5 TLden
		  25 kg fındık kilosunu 15,7 TLden
		  40 kg badem kilosunu 22 TLden
		  
		  almıştır
		  
		  bu ürünleri satarken
		  
		   leblebi %50 karla
		   fındık %40 karla
		   badem %60 karla satmıştır
		   
		   kuruyemişçi o gün kazandığı parayla kirasını ödemek istemektedir 
		   
		   kira tutarı 500 TL,
		   kazandığı para 500 Tlden yğksek ise ödeyebilir değil ise ödeyemez yazılı program
		  
		  
		  */
	
		double leblebi=3.5;
		double findik=15.7;
		double badem =22;
		
		double maliyet= (leblebi*12)+(findik*25)+(badem*40);
		double satis= ((leblebi*1.5)*12)+((findik*1.4)*25)+((badem*1.6)*40);
		double kaar=satis-maliyet;
		if (kaar>500)
		{
			System.out.println("Kirayı ödeyebilirsiniz");
			
		}
		else {
			System.out.println("Yeterli bakiyeniz nulunmamaktadır");
		}
		
		System.out.println("Maliyet Tutar" +maliyet);
		System.out.println("Satış Tutar" +satis);
		System.out.println("Kazan. Tutar" +kaar);
	}
	

}
