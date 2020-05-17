package chapter1;

public class Guitar {
	private String serialNumber;
	private Double price;
	private Builder builder;
	private Type type;
	private String model;
	
	public Guitar(String serialNumber, Double price, Builder builder, Type type, String model){
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.type = type;
		this.model = model;
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
	
	public Builder getBuilder() {
		return builder;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getModel() {
		return model;
	}
}
