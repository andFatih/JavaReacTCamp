package inheritance;

public class CustomerManager {
	
	//Polymorphism(polimorfizm), bir varl�k ya da nesnenin birden fazla forma sahip olmas� olarak adland�r�l�r. 
	//Yani olu�turdu�umuz bir nesne kendisi gibi de�il de ba�ka bir nesne gibi davran�yorsa buna 
	//polymorphism diyoruz. �ok bi�imlilik de denilebilir.
	
	//Extend eden classlar�n refanslar�n� tutar.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	
	
	//bulk insert
	//Birden fazla m��teri eklenmesi istendi. Bizde Dizi olarak ekleyece�iz.
	public void addMultiple(Customer[] customers) {
		
		for (Customer customer : customers) {
			add(customer);
		}
		
		
	}
	

}

