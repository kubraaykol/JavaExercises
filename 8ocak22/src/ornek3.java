
public class ornek3 {

	public static void main(String[] args) {
		int [] [] matris= {
				{56, 23, 678, 231},
				{234, 21, 78, 23},
				{654, 33, 22, 67},
				{189, 35, 56, 89}
				
		};
		
		int sutun = enbuyukelemaninoldugusutunudon(matris);
		System.out.println(sutundakienkucuksayiyiybul(matris,sutun));
		
		

	}

	public static int enbuyukelemaninoldugusutunudon(double [][] parametredizi) {
		doble enbuyuksutun=parametredizi[0][0];
		int sutun=0;
		for(int i=0; i<parametredizi.length; i++) {
			for (intj=0; j<parametredizi[0].length; j++) {
				if(enbuyuksayi<parametredizi[i][j]) {
					enbuyuksayi=parametredizi[i][j];
					sutun=j;
					
					
				}
			}
		}
	}
}
