package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitarList;
	
	public Inventory(){
		guitarList = new ArrayList<>();
	}
	
	public void addGuitar(String serialNumber, Double price, Builder builder, Type type, String model, int numStrings) {
		guitarList.add(new Guitar(serialNumber, price, new GuitarSpecifications(builder, type, model, numStrings)));
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(int i=0;i<guitarList.size();i++) {
			if(guitarList.get(i).getSerialNumber().equals(serialNumber)) {
				return guitarList.get(i);
			}
		}
		return null;
	}
	
	public List<Guitar> search(GuitarSpecifications customerSpecs) {
		List<Guitar> matchList = new ArrayList<>();
		for(int i=0;i<guitarList.size();i++) {
			if(!guitarList.get(i).getSpecs().equals(customerSpecs))
				continue;
			matchList.add(guitarList.get(i));
		}
		return matchList;
	}
}
