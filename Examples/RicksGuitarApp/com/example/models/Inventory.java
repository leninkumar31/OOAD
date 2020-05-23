package com.example.models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Instrument> instrumentList;

	public Inventory() {
		instrumentList = new ArrayList<>();
	}

	public void addInstrument(String serialNumber, Double price, InstrumentSpec spec) {
		instrumentList.add(new Instrument(serialNumber, price, spec));
	}

	public Instrument get(String serialNumber) {
		for (int i = 0; i < instrumentList.size(); i++) {
			if (instrumentList.get(i).getSerialNumber().equals(serialNumber)) {
				return instrumentList.get(i);
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec inputSpec) {
		List<Instrument> matchList = new ArrayList<>();
		for (int i = 0; i < instrumentList.size(); i++) {
			Instrument instrument = instrumentList.get(i);
			if (!instrument.getSpec().matches(inputSpec))
				continue;
			matchList.add(instrumentList.get(i));
		}
		return matchList;
	}
}
