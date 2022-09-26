package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DortIslem dortIslem = new DortIslem();
		int topla = dortIslem.Topla(8, 9);
		int cikar = dortIslem.Cikar(9, 8);
		int carp = dortIslem.Carp(8, 9);
		double bol = dortIslem.Bol(9, 8);
		System.out.println(topla);
		System.out.println(cikar);
		System.out.println(carp);
		System.out.println(bol);
	}

}
