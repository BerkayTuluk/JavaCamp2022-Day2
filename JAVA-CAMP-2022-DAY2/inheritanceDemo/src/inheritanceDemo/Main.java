package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OgrentmenKrediManager ogretmenKrediManager = new OgrentmenKrediManager();
		//ogretmenKrediManager.Hespla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgrentmenKrediManager());
	}

}
