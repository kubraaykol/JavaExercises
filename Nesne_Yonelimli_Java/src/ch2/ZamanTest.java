package ch2;

public class ZamanTest {
	public static void main(String[] args) {
	Zaman zaman=new Zaman();
	zaman.saatIlerlet();
	System.out.println("Saat:"+zaman.saat+"Dakika:"+zaman.dakika+"Saniye:"+zaman.saniye);
	
	Zaman zaman2=new Zaman();
	
	zaman2.saatIlerlet();
	
	System.out.println("Saat:"+zaman2.saat+"Dakika:"+zaman2.dakika+"Saniye:"+zaman2.saniye);
}
}
	
