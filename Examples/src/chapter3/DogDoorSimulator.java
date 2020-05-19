package chapter3;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Amy barks to go outside!");
		recognizer.recognize("Woof!");
		//remote.pressButton();
		System.out.println("Amy is gone outside");
		System.out.println("Amy is all gone");
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Amy is stuck outside");
		System.out.println("Amy starts barking again!");
		recognizer.recognize("Woof!");
		System.out.println("Amy is inside");
	}

}
