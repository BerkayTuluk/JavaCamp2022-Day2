package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(5,6));
		int topla2 = dortIslem.topla(3, 2, 6);
		System.out.println(topla2);
	}

}
