
public abstract class Sekil {

	private String isim; // Tüm classlarýn isim özelliði olacak

	
	public Sekil(String isim) {		// Sekil classýnýn constructorý
		super();
		this.isim = isim;
	}
	
	abstract void alanhesapla() {  // void sadece methodda print ile bir þey yazdýrýldýðýnda býr deger donmedýgýnde kullanýlýr
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
}
