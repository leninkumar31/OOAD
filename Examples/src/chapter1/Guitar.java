package chapter1;

public class Guitar {
	private String serialNumber;
	private Double price;
	private GuitarSpecifications specs;
	
	public Guitar(String serialNumber, Double price, GuitarSpecifications specs){
		this.serialNumber = serialNumber;
		this.price = price;
		this.specs = specs;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public GuitarSpecifications getSpecs() {
		return specs;
	}
}
