package artifact;

public class Tire {

	String brand;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String toString() {
		return "Tire brand="+getBrand();
	}

	public Tire(String brand) {
		super();
		this.brand = brand;
	}
}
