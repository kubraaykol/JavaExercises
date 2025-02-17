package ch2;

import java.util.Locale.Category;

public class product_odev {
	
	private  String id;
	private  String isim;
	private double adet;
	private Category kategori;

	public String getId() { return id; }
	public void setId(String id) {this.id=id;}
	public String getisim() {return isim;}
	public void setisim (String isim) {this.isim=isim;}
	public double getadet() {return adet;}
	public void setadet(double adet) {this.adet=adet;}
	public Category getKategori() {
		return kategori;
	}	 
	public void setKategori (Category kategori) {this.kategori=kategori;}
}
class Category {
	private String id;
	private String isim;
	private product urun;
	
	public String getId() {return id;}
	public void setId(String id) {this.id=id;}
	public String getisim() {return isim;}
	public void setisim (String isim) {this.isim=isim;}
	public product_odev geturun() {return urun;}
	public void setUrun (Product urun) {this.urun=urun;} 
	
	
			
	
	
	

}
