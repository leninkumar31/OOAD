package com.example.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.enums.Builder;
import com.example.models.Instrument;
import com.example.models.InstrumentSpec;
import com.example.models.Inventory;

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		Map<String, Object> properties = new HashMap<>();
		properties.put("builder", Builder.GIBSON);
		InstrumentSpec customerSpec = new InstrumentSpec(properties);
		List<Instrument> matchList = inventory.search(customerSpec);
		if (matchList.size() != 0) {
			for (int i = 0; i < matchList.size(); i++) {
				Instrument instrument = matchList.get(i);
				InstrumentSpec spec = instrument.getSpec();
				System.out
						.println("We have a " + spec.getProperty("instrumentType") + " with the following properties");
				for (String propertyName : spec.getProperties().keySet()) {
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("      " + propertyName + ": " + spec.getProperties().get(propertyName));
				}
				System.out.println("You can have this "+ spec.getProperty("instrumentType") + " for price "+ instrument.getPrice()+" $");
			}
		} else {
			System.out.println("Sorry man, we couldn't find any instrument for you!!");
		}
	}

	public static void initializeInventory(Inventory inventory) {
		// logic to fill the inventory
	}
}
