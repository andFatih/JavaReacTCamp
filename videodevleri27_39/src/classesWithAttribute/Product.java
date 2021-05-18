package classesWithAttribute;


//�r�n
//�zellikleri bar�nd�yor, i�lemci, ram, boy, kilo, adet,

public class Product {
	
	//attribute & field
	// Ba�lar�nda biz g�rmesekte varsay�lan olara publik yazar.
//	int id;
//	String name;
//	String descreption;
//	double price;
//	int stockAmount;
	
	
	//ENCAPSULAT�ON Kaps�lleme yap�yoruz. 
	//Get Getir, Almak, Okumak ama�la�
	//Set Kurmak, Ayarlamak De�er Vermeye yarar, 
	private int id;
	private String name;
	private String descreption;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	
	
	//Parametresiz Consracter biz g�rmesekte varsay�lan olarak var
	public Product() {
		System.out.println("Yap�c� Blok Parametresiz Consracter �al��t�");
	}
	
	
	
	//Paremetreli Consracter
	public Product(int id, String name, String descreption, double price, int stockAmount, String renk, String kod) {

		this.id = id;
		this.name = name;
		this.descreption = descreption;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
		this.kod = kod;
		
		System.out.println("Parametreli Consracter �al��t�");
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	//�r�n Kodunu otomatik olu�sun diye, isimden ilk 2 harf ald�k ve
	//id ekledik.
	public String getKod() {
		return this.name.substring(0,2)+id;
	}
	
	//Kodu yaz�labilir istemedi�im i�in bunu siliyorum.
//	public void setKod(String kod) {
//		this.kod = kod;
//	}
//	

	
}
