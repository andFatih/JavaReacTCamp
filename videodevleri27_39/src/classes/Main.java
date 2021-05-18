package classes;

public class Main {

	public static void main(String[] args) {
		
		//Bellekte customerManager t�r�nde bir nesne (reference type) olu�turduk.
		//Sol taraf STACK isim k�sm�.
		//Sa� taraf HEAP /add,remove,uptade burada �al���r.
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Uptade();
		
		
		//�lkel veri tipi
		//De�er (value) tip, her�ey Stack'te olu�ur
		//cevap 10
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//Diziler Referans tiptir.
		//HEAP
		//Stack'ta ismi sol taraf, Heap'te de�erleri olu�turur.
		int [] sayilar1 = new int[] {1,2,3};
		int [] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);

	}	
}
