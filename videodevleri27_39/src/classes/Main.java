package classes;

public class Main {

	public static void main(String[] args) {
		
		//Bellekte customerManager türünde bir nesne (reference type) oluþturduk.
		//Sol taraf STACK isim kýsmý.
		//Sað taraf HEAP /add,remove,uptade burada çalýþýr.
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Uptade();
		
		
		//Ýlkel veri tipi
		//Deðer (value) tip, herþey Stack'te oluþur
		//cevap 10
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//Diziler Referans tiptir.
		//HEAP
		//Stack'ta ismi sol taraf, Heap'te deðerleri oluþturur.
		int [] sayilar1 = new int[] {1,2,3};
		int [] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);

	}	
}
