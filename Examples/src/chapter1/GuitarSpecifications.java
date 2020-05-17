package chapter1;

public class GuitarSpecifications {
	private Builder builder;
	private Type type;
	private String model;
	
	public GuitarSpecifications(Builder builder, Type type, String model){
		this.builder = builder;
		this.type = type;
		this.model = model;
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
