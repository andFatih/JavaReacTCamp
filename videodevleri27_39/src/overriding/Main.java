 package overriding;


public class Main {
	public static void main(String[] args) {
		
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		double result = ogretmenKrediManager.hesapla(1000);
//		System.out.println(result);
		
		BaseKrediManager [] baseKrediManagers = new BaseKrediManager[]
				{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
		System.out.println(baseKrediManager.hesapla(1000));
		}
	}
}
