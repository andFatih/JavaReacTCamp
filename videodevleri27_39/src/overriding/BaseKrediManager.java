package overriding;

public class BaseKrediManager {
	
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
	
	//E�er bu metodun �zerine yaz�lmas�n� istemiyorsak final ekleriz.
	
	/*
	 * public final double hesapla(double tutar) {
		return tutar*1.18;
	}
	 */

}
