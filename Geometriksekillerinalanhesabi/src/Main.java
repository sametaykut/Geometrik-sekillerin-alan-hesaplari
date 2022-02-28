import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		String islemler = "��lemler\n"+
						  "1. Kare Alan Hesapla\n"+
						  "2. ��gen Alan Hesapla\n"+
						  "3. Daire Alan Hesapla\n"+
						  "��k�� i�in q 'ya bas�n�z.";
		while (true) {
			System.out.println(islemler);
			System.out.print("Hangi �eklin alan�n� hesaplamak istiyorsunuz : ");
			String sekil_turu = scanner.nextLine();
			Sekil sekil = null;    // Sekil referans� olusturuldu ama herhangi bir �ey g�stermemesi i�in null a e�itlendi.
			if(sekil_turu.equals("q")) {
				System.out.println("Programdan ��k�� yap�l�yor ...");
				break;
			}
			
			if (sekil_turu.equals("1")) {
				System.out.print("Karenin kenar� :");
				int kenar = scanner.nextInt();
				scanner.nextLine();
				sekil = new Kare ("Kare1",kenar);
				sekil.alanhesapla();
		
		}
		else if (sekil_turu.equals("2")) {
			System.out.print("Kenar 1 : ");
			int kenar1 = scanner.nextInt();
			System.out.print("Kenar 2 : ");
			int kenar2 = scanner.nextInt();
			System.out.print("Kenar 3 : ");
			int kenar3 = scanner.nextInt();
			scanner.nextLine();
			sekil = new Ucgen ("Ucgen1",kenar1,kenar2,kenar3);
			sekil.alanhesapla();
			
		}
		else if (sekil_turu.equals("3")) {
			
			System.out.print("Dairenin yar�cap� :");
			int yaricap = scanner.nextInt();
			scanner.nextLine();
			sekil = new Daire ("Daire1",yaricap);
			sekil.alanhesapla();
			
		}
		else {
			System.out.println("B�yle bir i�lem bulunmamaktad�r.");
		}
	}

}
}
