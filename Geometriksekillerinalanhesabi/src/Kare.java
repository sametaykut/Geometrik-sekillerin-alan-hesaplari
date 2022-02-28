
public class Kare extends Sekil {
	private int kenar ;
	
	
	
	
	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
	}




	@Override
	public void alanhesapla() {
	
		System.out.println(getIsim() + "in alanı :" + (kenar*kenar));
		
	}

	
}
