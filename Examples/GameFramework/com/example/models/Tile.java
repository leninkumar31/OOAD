package com.example.models;

import java.util.LinkedList;
import java.util.List;

public class Tile {
	List<Unit> units;

	public Tile() {
		this.units = new LinkedList<>();
	}

	public void addUnit(Unit u) {
		this.units.add(u);
	}

	public void remoteUnit(Unit u) {
		this.units.remove(u);
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void removeUnits() {
		this.units = null;
	}
}
