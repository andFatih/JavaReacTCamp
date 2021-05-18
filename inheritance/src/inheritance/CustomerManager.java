package inheritance;

public class CustomerManager {
	
	//Polymorphism(polimorfizm), bir varlýk ya da nesnenin birden fazla forma sahip olmasý olarak adlandýrýlýr. 
	//Yani oluþturduðumuz bir nesne kendisi gibi deðil de baþka bir nesne gibi davranýyorsa buna 
	//polymorphism diyoruz. Çok biçimlilik de denilebilir.
	
	//Extend eden classlarýn refanslarýný tutar.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	
	
	//bulk insert
	//Birden fazla müþteri eklenmesi istendi. Bizde Dizi olarak ekleyeceðiz.
	public void addMultiple(Customer[] customers) {
		
		for (Customer customer : customers) {
			add(customer);
		}
		
		
	}
	

}

