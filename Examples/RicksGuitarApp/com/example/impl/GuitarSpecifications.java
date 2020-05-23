package com.example.impl;

import com.example.enums.Builder;
import com.example.enums.Type;
import com.example.models.InstrumentSpec;

public class GuitarSpecifications extends InstrumentSpec {
	private int numStrings;

	public GuitarSpecifications(Builder builder, Type type, String model, int numStrings) {
		super(builder, type, model);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	@Override
	public boolean matches(InstrumentSpec o) {
		if (!(o instanceof GuitarSpecifications))
			return false;
		if (o == this)
			return true;
		GuitarSpecifications other = (GuitarSpecifications) o;
		return (this.numStrings == other.numStrings) && this.equals(other);
	}
}
