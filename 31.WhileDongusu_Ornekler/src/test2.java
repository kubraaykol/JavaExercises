
public class test2 {

	public static void main(String[] args) {
		// 1'den 10'a kadar olan �ift say�lar toplam�n� While ile yazd�r
		
		int i=1;
		int toplam=0;
		while(i<=10)
		{
			if(i%2==0) { /*tek say�lar if(i%2==1) */
				toplam+=i;
				
			}
			i++;
		}
System.out.println("�ift say�lar�n toplam�: " +toplam);
	}

}
