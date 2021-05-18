package inheritanceDemo;


//Diðer yerlere dokunmadan programýn sürdürülebilirliðini saðlýyoruz.
//istediðimiz kadar kredi eklesekte diðer kodlarýmýz bozulmuyor
//Polomorfizm
public class MemurKrediManager extends BaseKrediManager {
	public void memurKredisi(MemurKrediManager memurKrediManager) {
		System.out.println("Memur Kresi Hesaplandý");
	}
}
