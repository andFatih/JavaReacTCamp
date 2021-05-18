package oopIntro;

public class ProductManager {
	
	public void addToCart(Product product) {//metotun içine parametre ekliyoruz.
		
		System.out.println("Sepete Ekledi: "+product.name);
	}

	public void delete(Product product) {
		System.out.println("Ürün Silindi: "+product.name);
	}
}
