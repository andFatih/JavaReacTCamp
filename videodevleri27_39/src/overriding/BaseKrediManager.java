package overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
	
	//Eğer bu metodun üzerine yazılmasını istemiyorsak final ekleriz.
	
	/*
	 * public final double hesapla(double tutar) {
		return tutar*1.18;
	}
	 */

}
