package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Instrument;
import com.example.models.InstrumentSpec;

public class Inventory {
	private List<Instrument> instrumentList;

	public Inventory() {
		instrumentList = new ArrayList<>();
	}

	public void addInstrument(String serialNumber, Double price, InstrumentSpec specs) {
		Instrument instrument = null;
		if (specs instanceof GuitarSpecifications) {
			instrument = new Guitar(serialNumber, price, (GuitarSpecifications) specs);
		} else if (specs instanceof MandolinSpecifications) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpecifications) specs);
		}
		instrumentList.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (int i = 0; i < instrumentList.size(); i++) {
			if (instrumentList.get(i).getSerialNumber().equals(serialNumber)) {
				return instrumentList.get(i);
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpecifications customerSpecs) {
		List<Guitar> matchList = new ArrayList<>();
		for (int i = 0; i < instrumentList.size(); i++) {
			Instrument instrument = instrumentList.get(i);
			if (instrument.getSpec() instanceof GuitarSpecifications) {
				GuitarSpecifications guitarSpecs = (GuitarSpecifications) instrument.getSpec();
				if (!guitarSpecs.matches(customerSpecs))
					continue;
				matchList.add((Guitar) instrumentList.get(i));
			}
		}
		return matchList;
	}

	public List<Mandolin> search(MandolinSpecifications customerSpecs) {
		List<Mandolin> matchList = new ArrayList<>();
		for (int i = 0; i < instrumentList.size(); i++) {
			Instrument instrument = instrumentList.get(i);
			if (instrument.getSpec() instanceof MandolinSpecifications) {
				MandolinSpecifications mandolinSpecs = (MandolinSpecifications) instrument.getSpec();
				if (!mandolinSpecs.matches(customerSpecs))
					continue;
				matchList.add((Mandolin) instrumentList.get(i));
			}
		}
		return matchList;
	}
}
