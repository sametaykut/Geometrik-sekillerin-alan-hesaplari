
public abstract class Sekil {

	private String isim; // T�m classlar�n isim �zelli�i olacak

	
	public Sekil(String isim) {		// Sekil class�n�n constructor�
		super();
		this.isim = isim;
	}
	
	abstract void alanhesapla() {  // void sadece methodda print ile bir �ey yazd�r�ld���nda b�r deger donmed�g�nde kullan�l�r
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
}
