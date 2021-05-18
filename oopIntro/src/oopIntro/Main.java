package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo V14",15000,"16 GB Ram",
				10,13500); // referans oluþturma, intance
//		product1.id=1;
//		product1.name="Lenovo V14";
//		product1.unitPrice=15000;
//		product1.detail="16 GB Ram";
		
		Product product2= new Product();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3= new Product(); 
		product3.id=3;
		product3.name="Hp Maksimus";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		
		Product [] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		//Category classýndaki fieldleri private yaptýktan sonra çalýþmaz hale geldi
		//Çalýþmasý için getter ve setter VE consrater ayarladýk. 
//		Category category1=new Category();
//		category1.id=1;
//		category1.name="Bahçe";
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Bahçe");
		
//		Category category2=new Category();
//		category2.id=2;
//		category2.name="Otomobil";
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Otomobil");
		
//		Category [] categories = {category1,category2};
//		for (Category category : categories) {
//			
//			//System.out.println(category.name);
//			
//		}
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		productManager.delete(product2);
		
		

	}

}
