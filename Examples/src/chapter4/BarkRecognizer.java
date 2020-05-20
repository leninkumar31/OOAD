package chapter4;

import java.util.List;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("Bark recognizer heard a " + bark.getSound());
		List<Bark> allowedBarks = door.getAllowedBarks();
		for (int i = 0; i < allowedBarks.size(); i++) {
			if (allowedBarks.get(i).equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("This dog is not allwed!!");
	}
}
