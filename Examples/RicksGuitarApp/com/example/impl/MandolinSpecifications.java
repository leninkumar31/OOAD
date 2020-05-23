package com.example.impl;

import com.example.enums.Builder;
import com.example.enums.Style;
import com.example.enums.Type;
import com.example.models.InstrumentSpec;

public class MandolinSpecifications extends InstrumentSpec {
	Style style;

	public MandolinSpecifications(Builder builder, Type type, String model, Style style) {
		super(builder, type, model);
		this.style = style;
	}

	@Override
	public boolean matches(InstrumentSpec o) {
		if (!(o instanceof MandolinSpecifications))
			return false;
		if (o == this)
			return true;
		MandolinSpecifications other = (MandolinSpecifications) o;
		return (this.style == other.style) && this.equals(other);
	}
}
