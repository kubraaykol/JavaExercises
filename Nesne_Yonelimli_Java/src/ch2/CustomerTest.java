package ch2;

import java.time.LocalDate;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1=new Customer();
		customer1.ad="K�bra";
		customer1.soyad="Aykol";
		customer1.medeniHal=true;
		customer1.dogumTarihi=LocalDate.of(2000, 12, 24);
		customer1.yas=22;
		
		Customer customer2=new Customer();
		customer2.ad="�evval";
		customer2.soyad="K���k�avu�";
		customer2.medeniHal=true;
		customer2.dogumTarihi=LocalDate.of(2002, 01, 12);
		customer2.yas=20;
		
		System.out.println("Ad Soyad:"+customer1.ad+""+customer1.soyad+ 
				"Medeni Hal:"+customer1.medeniHal+"Ya�:"+customer1.yas);
		
		System.out.println("Ad Soyad:"+customer2.ad+""+customer2.soyad+ 
				"Medeni Hal:"+customer2.medeniHal+"Ya�:"+customer2.yas);
		
		
		
		
		
	}

}
