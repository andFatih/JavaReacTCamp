package oopIntro;

public class ProductManager {
	
	public void addToCart(Product product) {//metotun i�ine parametre ekliyoruz.
		
		System.out.println("Sepete Ekledi: "+product.name);
	}

	public void delete(Product product) {
		System.out.println("�r�n Silindi: "+product.name);
	}
}
