package inheritance2;

public class Filelogger extends Logger {
	@Override //override ezmek, javada yazmaksakta olur ama okunabilirlik a��s�ndan yazmam�z daha iyi
	//a�a��ya kendi kodumu yaz�cam demek
	public void log() {
		System.out.println("Dosya Logland�");
	}
}
