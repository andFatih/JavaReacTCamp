package polymorphismDemo;


public class Main {
	public static void main(String[] args) {
		
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Log mesajý");
		
		BaseLogger [] baseLoggers=new BaseLogger[] {
			new FileLogger(),
			new DatabaseLogger(),
			new EmailLogger()
		};
		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.log("Mesaj");
		}
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
		
	}

}
