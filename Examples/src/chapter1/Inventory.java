package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitarList;
	
	public Inventory(){
		guitarList = new ArrayList<>();
	}
	
	public void addGuitar(String serialNumber, Double price, Builder builder, Type type, String model) {
		guitarList.add(new Guitar(serialNumber, price, new GuitarSpecifications(builder, type, model)));
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
			Builder builder = customerSpecs.getBuilder();
			if(builder!=null && !builder.equals("")&& builder != guitarList.get(i).getSpecs().getBuilder())
				continue;
			String model = customerSpecs.getModel();
			if(model!=null && !model.equals("")&&!model.toLowerCase().equals(guitarList.get(i).getSpecs().getModel().toLowerCase()))
				continue;
			Type type = customerSpecs.getType();
			if(type!=null && !type.equals("")&&type != guitarList.get(i).getSpecs().getType())
				continue;
			matchList.add(guitarList.get(i));
		}
		return matchList;
	}
}
