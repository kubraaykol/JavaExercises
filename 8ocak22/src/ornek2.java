
public class ornek2 {

	public static void main(String[] args) {
		double [] [] tablo= new double [] [] {
			{34,11, -7, 53},
			{254, 8, -65, 4},
			{110, 54, 33, 26} };
			
			System.out.println(enBuyukSayiyiBul(tablo));
			System.out.println(enKucukSayiyiBul(tablo));
	}
	public static double enBuyukSayiyiBul (double [] [] parametreDizi) {
		double enBuyukSayi = parametreDizi[0] [0];
		for (int i=0; i<parametreDizi.length; i++) {
			for (int j=0; j<parametreDizi[i].length; j++) {
				if (enBuyukSayi<parametreDizi[i][j]) {
					enBuyukSayi=parametreDizi[i][j];
					
				}
			}
			
		}
return enBuyukSayi;
	}
static double enKucukSayiyiBul (double [][] parametreDizi) {
	for (int i=0; i<parametreDizi [0] [0] );
}
}
