package inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		IndividualCustomer fatih = new IndividualCustomer();
		fatih.customerNumber="12345";
	
		
		CorporeteCustomer hepsiBurada= new CorporeteCustomer();
		hepsiBurada.customerNumber="67890";
		
		SendikaCustomer yapiSendikasi=new SendikaCustomer();
		yapiSendikasi.customerNumber="99999";
		
		
		
//		CustomerManager customerManager=new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(fatih);
//		customerManager.add(yapiSendikasi);

		
		//Gerçek hayatta polimorfizim
		CustomerManager customerManager=new CustomerManager();
		Customer [] customers= {fatih,hepsiBurada,yapiSendikasi};
		customerManager.addMultiple(customers);
		
		
		
	}

}
