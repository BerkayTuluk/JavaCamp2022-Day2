package methods2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sehir = sehirVer();
		System.out.println(sehir);
		int toplam = topla(2, 5);
		System.out.println(toplam);
		ekle();
		sil();
		güncelle();
		int toplam2= topla2(1,2,3,4,5,6,7,8,9);
		System.out.println(toplam2);
	}
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("Slindi");
	}
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla (int sayi, int sayi2) {
		return sayi+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam =0;
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	
	public static String sehirVer() {
		return "Ankara";
	}

}
