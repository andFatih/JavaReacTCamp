package oopIntro;



public class Product {
	
	int id;
	String name;
	double unitPrice;
	String detail;
	double discount;
	double unitPriceAfterDiscount;
	
	
	//Consracter bir nesnenin referans�n� bellekte olu�turdu�umuzda, �al��an bloktur.
	//Bir consracter �al��mak zorunda, birden fazla consracter varsa sadace biri �al���r.
	public Product() {
		System.out.println("Consracter �al��t�");
	}

	
	//this.class taki id, id consracterdaki id temsil eder.
	//Yani sol taraf class isimleri, sa� taraf consracterdaki isimleri temsil eder.
	public Product(int id, String isim, double unitPrice, String detail, double discount, double unitPriceAfterDiscount) {
		this();//this bu class demek, yukar�daki consracter�nda her yerde �al��mas�n� istiyorsak bunu yazar�z.
		this.id = id;
		this.name = isim;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
		this.unitPriceAfterDiscount=unitPrice;
		//System.out.println("2. Consracterda �al��t�");
	}


	//Get okumak
	//Set yazmak
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
		//parametre olmad��� zamanlarda class fieldi olur
		//return this.name demek.
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}
	
	
	

}
