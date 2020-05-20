package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private List<Bark> allowedBarks;

	public DogDoor() {
		this.open = false;
		this.allowedBarks = new ArrayList<>();
	}

	public void open() {
		System.out.println("Dog door opens!");
		open = true;
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("Dog door closes!");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public void setAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public List<Bark> getAllowedBarks() {
		return allowedBarks;
	}
}
