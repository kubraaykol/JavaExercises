
public class test {

	public static void main(String[] args) {
		//1'den 10'a kadar olan �ift say�lar�n toplam�
		
		int toplam=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0) //tek say�lar if(i%2==1)
			{
				toplam+=i;
			}
		}
System.out.println("Sonu�:"+toplam);
	}

}
