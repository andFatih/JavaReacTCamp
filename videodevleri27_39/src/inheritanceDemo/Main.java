package inheritanceDemo;



public class Main {

	public static void main(String[] args) {
		
		
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		ogretmenKrediManager.Hesapla();
		
		KrediUIArayüz krediUIArayüz = new KrediUIArayüz();
		krediUIArayüz.KrediHesapla(new TarimKrediManager());
		krediUIArayüz.KrediHesapla(new OgretmenKrediManager());
		krediUIArayüz.KrediHesapla(new MemurKrediManager());

	}

}
