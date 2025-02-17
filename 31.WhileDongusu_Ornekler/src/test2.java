
public class test2 {

	public static void main(String[] args) {
		// 1'den 10'a kadar olan çift sayýlar toplamýný While ile yazdýr
		
		int i=1;
		int toplam=0;
		while(i<=10)
		{
			if(i%2==0) { /*tek sayýlar if(i%2==1) */
				toplam+=i;
				
			}
			i++;
		}
System.out.println("Çift sayýlarýn toplamý: " +toplam);
	}

}
