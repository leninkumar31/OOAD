package com.example.enums;

public enum InstrumentType {
	GUITAR, MANDOLIN;

	@Override
	public String toString() {
		switch (this) {
		case GUITAR:
			return "guitar";
		case MANDOLIN:
			return "mandolin";
		}
		return null;
	}
}
