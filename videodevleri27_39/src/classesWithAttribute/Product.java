package classesWithAttribute;


//Ürün
//Özellikleri barýndýyor, iþlemci, ram, boy, kilo, adet,

public class Product {
	
	//attribute & field
	// Baþlarýnda biz görmesekte varsayýlan olara publik yazar.
//	int id;
//	String name;
//	String descreption;
//	double price;
//	int stockAmount;
	
	
	//ENCAPSULATÝON Kapsülleme yapýyoruz. 
	//Get Getir, Almak, Okumak amaçlaý
	//Set Kurmak, Ayarlamak Deðer Vermeye yarar, 
	private int id;
	private String name;
	private String descreption;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	
	
	//Parametresiz Consracter biz görmesekte varsayýlan olarak var
	public Product() {
		System.out.println("Yapýcý Blok Parametresiz Consracter Çalýþtý");
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
		
		System.out.println("Parametreli Consracter Çalýþtý");
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
	
	//Ürün Kodunu otomatik oluþsun diye, isimden ilk 2 harf aldýk ve
	//id ekledik.
	public String getKod() {
		return this.name.substring(0,2)+id;
	}
	
	//Kodu yazýlabilir istemediðim için bunu siliyorum.
//	public void setKod(String kod) {
//		this.kod = kod;
//	}
//	

	
}
