package chapter4;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.setAllowedBark(new Bark("rowlf!"));
		door.setAllowedBark(new Bark("rooowlf!"));
		door.setAllowedBark(new Bark("rawlf!"));
		door.setAllowedBark(new Bark("woof!"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Amy barks to go outside!");
		recognizer.recognize(new Bark("rowlf!"));
		//remote.pressButton();
		System.out.println("Amy is gone outside");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Amy is stuck outside");
		Bark newSmallDog = new Bark("ffff");
		System.out.println("Small dog starts barking!");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recognizer.recognize(newSmallDog);
		System.out.println("Amy starts barking again!");
		recognizer.recognize(new Bark("woof!"));
		System.out.println("Amy is inside");
	}

}
