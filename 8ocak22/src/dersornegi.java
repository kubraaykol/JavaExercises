
public class dersornegi {

	public static void main(String[] args) {
		long [] [] dizi = new long [3] [3];
		long baslangicdegeri=2;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				dizi [i][j]= faktoriyelhesapla (baslangicdegeri);
				baslangicdegeri +=2;
				System.out.printf(dizi[i][j]+"");
				
			}
			System.out.println();
		}

	}
public static long faktoriyelhesapla (long sayi) {
	long sonuc = 1;
	for (int i=1; i<= sayi; i++) {
		sonuc *=i;
		
	}
	return sonuc;
}
}
