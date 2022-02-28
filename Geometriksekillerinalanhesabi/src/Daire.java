
public class Daire extends Sekil {
	
	private int yaricap;
	
	public Daire(String isim, int yaricap) {
		super(isim);
		this.yaricap = yaricap;
	}

	public void alanhesapla() {
		
		System.out.println(getIsim() + "ýn alaný :" + (Math.PI * yaricap * yaricap));
		
		
	}

}
