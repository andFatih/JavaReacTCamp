package inheritance2;



public class LogManager {
	public void log(int logType) {
		
		//TODO: Birbirinin alternatifi olan kodlar ifle y�netilmez
		if(logType == 1) {
			System.out.println("Veritaban�na Logland�");
		}else if (logType==2) {
			System.out.println("Dosyaya Logland�");
		}else {
			System.out.println("Email G�nderildi");
		}
		
	}

}

//1- Database
//2- File
//3- Email