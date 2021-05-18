package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}



	public void add() {
		System.out.println("M��teri Eklendi");
		this.baseLogger.log("Loggg Mesaj�");
		
		//classlarda s�rekl� new a�mamal�y�z onun yerine yukar�daki i�lem yap�lmal�
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.Log("Logg Mesaj�");
	}

}
