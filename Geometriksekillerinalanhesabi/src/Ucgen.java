
public class Ucgen extends Sekil  {
	
	public Ucgen(String isim, int a , int b , int c ) {
		super(isim);
		this.a= a;
		this.b =b;
		this.c =c;
	}
	private int a;
	private int b;
	private int c;
	
	@Override 
	
	public void alanhesapla() {
	double	u = (a+b+c) / 2.0 ;
	double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
	System.out.println(getIsim() + "in alaný =" + alan);
	
		
	}

}
