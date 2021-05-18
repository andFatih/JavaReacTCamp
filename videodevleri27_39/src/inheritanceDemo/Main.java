package inheritanceDemo;



public class Main {

	public static void main(String[] args) {
		
		
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		ogretmenKrediManager.Hesapla();
		
		KrediUIAray�z krediUIAray�z = new KrediUIAray�z();
		krediUIAray�z.KrediHesapla(new TarimKrediManager());
		krediUIAray�z.KrediHesapla(new OgretmenKrediManager());
		krediUIAray�z.KrediHesapla(new MemurKrediManager());

	}

}
