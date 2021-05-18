package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}



	public void add() {
		System.out.println("Müþteri Eklendi");
		this.baseLogger.log("Loggg Mesajý");
		
		//classlarda süreklü new açmamalýyýz onun yerine yukarýdaki iþlem yapýlmalý
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.Log("Logg Mesajý");
	}

}
