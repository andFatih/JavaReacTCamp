package oopIntro;

public class Category {

	private int id;
	private String name;
	
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name+"!";//Y�netim isimlerden de�i�iklik istedi. Tek yerden ger�ekle�tirdik
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
