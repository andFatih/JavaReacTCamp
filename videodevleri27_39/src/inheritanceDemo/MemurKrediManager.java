package inheritanceDemo;


//Di�er yerlere dokunmadan program�n s�rd�r�lebilirli�ini sa�l�yoruz.
//istedi�imiz kadar kredi eklesekte di�er kodlar�m�z bozulmuyor
//Polomorfizm
public class MemurKrediManager extends BaseKrediManager {
	public void memurKredisi(MemurKrediManager memurKrediManager) {
		System.out.println("Memur Kresi Hesapland�");
	}
}
