package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun=8.15;
		double dolarBugun=8.15;
		int vade=36;
		boolean dustuMu=false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D��t�");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar Y�kseldi");
		}else {
			System.out.println("Dolar E�ittir");
		}
		
		String kredi1="H�zl� Kredi";
		String kredi2="Emekli Kredisi";
		String kredi3="Konut Kredisi";
		String kredi4="Ara� Kredisi";
		String kredi5="�ift�i Kredisi";
		
		System.out.println(kredi1);
		
		
		String [] krediler= {"H�zl� Kredi","Emekli Kredisi","Konut Kredisi","Ara� Kredisi","�ift�i Kredisi","MEB Kredisi"};
		
		//foreach
		for(String krediYaz:krediler) {
			System.out.println(krediYaz);
			
			System.out.println(" ");
			
		}
		
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		//int,byte,float, bolean, vs Say�sal veri tipleri De�er Tip
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		//Dizi,Class,�nterface,Abstract Class Referans Tip
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		System.out.println(sayilar2[1]);
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
