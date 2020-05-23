package com.example.models;

import com.example.enums.Builder;
import com.example.enums.Type;

public abstract class InstrumentSpec {
	private Builder builder;
	private Type type;
	private String model;

	public InstrumentSpec(Builder builder, Type type, String model) {
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
	
	public abstract boolean matches(InstrumentSpec spec);

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof InstrumentSpec))
			return false;
		if (o == this)
			return true;
		InstrumentSpec other = (InstrumentSpec) o;
		return (this.builder == other.builder) && (this.type == other.type) && ((this.model != null)
				&& (!this.model.equals("")) && this.model.toLowerCase().equals(other.getModel().toLowerCase()));
	}
}
