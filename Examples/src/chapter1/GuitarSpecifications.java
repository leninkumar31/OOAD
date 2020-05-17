package chapter1;

public class GuitarSpecifications {
	private Builder builder;
	private Type type;
	private String model;
	private int numStrings;

	public GuitarSpecifications(Builder builder, Type type, String model, int numStrings) {
		this.builder = builder;
		this.type = type;
		this.model = model;
		this.numStrings = numStrings;
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

	public int getNumStrings() {
		return numStrings;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof GuitarSpecifications))
			return false;
		if (o == this)
			return true;
		GuitarSpecifications other = (GuitarSpecifications) o;
		return (this.builder == other.builder) && (this.type == other.type) 
				&& (this.numStrings == other.numStrings)
				&& ((this.model!=null)&&(!this.model.equals(""))&&this.model.toLowerCase().equals(other.getModel().toLowerCase()));
	}
}
