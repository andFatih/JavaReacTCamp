package inheritance2;

public class Filelogger extends Logger {
	@Override //override ezmek, javada yazmaksakta olur ama okunabilirlik açýsýndan yazmamýz daha iyi
	//aþaðýya kendi kodumu yazýcam demek
	public void log() {
		System.out.println("Dosya Loglandý");
	}
}
