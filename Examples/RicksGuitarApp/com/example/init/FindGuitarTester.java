package com.example.init;

import java.util.List;

import com.example.enums.Builder;
import com.example.enums.Type;
import com.example.impl.Guitar;
import com.example.impl.GuitarSpecifications;
import com.example.impl.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpecifications customerSpecs = constructCustomerChoice();
		List<Guitar> matchList = inventory.search(customerSpecs);
		if (matchList.size() != 0) {
			System.out.println("You might like this: " + matchList);
		} else {
			System.out.println("Sorry man, we couldn't find guitar for you!!");
		}
	}

	public static void initializeInventory(Inventory inventory) {
		// logic to fill the inventory
	}

	public static GuitarSpecifications constructCustomerChoice() {
		// construct guitar object based on customer input
		return new GuitarSpecifications(Builder.ANY, Type.ACOUSTIC, "model",12);
	}

}
