package inheritance2;



public class LogManager {
	public void log(int logType) {
		
		//TODO: Birbirinin alternatifi olan kodlar ifle yönetilmez
		if(logType == 1) {
			System.out.println("Veritabanına Loglandı");
		}else if (logType==2) {
			System.out.println("Dosyaya Loglandı");
		}else {
			System.out.println("Email Gönderildi");
		}
		
	}

}

//1- Database
//2- File
//3- Email