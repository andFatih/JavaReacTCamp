package inheritanceDemo;


//Diğer yerlere dokunmadan programın sürdürülebilirliğini sağlıyoruz.
//istediğimiz kadar kredi eklesekte diğer kodlarımız bozulmuyor
//Polomorfizm
public class MemurKrediManager extends BaseKrediManager {
	public void memurKredisi(MemurKrediManager memurKrediManager) {
		System.out.println("Memur Kresi Hesaplandı");
	}
}
