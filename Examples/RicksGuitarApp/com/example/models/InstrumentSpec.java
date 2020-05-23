package com.example.models;

import java.util.HashMap;
import java.util.Map;

import com.example.enums.Builder;
import com.example.enums.Type;

public class InstrumentSpec {
	private Map<String, Object> properties;

	public InstrumentSpec(Map<String, Object> map) {
		if (map == null) {
			this.properties = new HashMap<>();
		} else {
			this.properties = new HashMap<>(map);
		}
	}

	public Object getProperty(String key) {
		if (properties.containsKey(key)) {
			return properties.get(key);
		}
		return null;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		Map<String, Object> otherProperties = otherSpec.getProperties();
		for (String key : otherProperties.keySet()) {
			if (!properties.containsKey(key) || properties.get(key).equals(otherProperties.get(key))) {
				return false;
			}
		}
		return true;
	}
}
