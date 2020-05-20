package chapter4;

public class Bark {
	private String sound;
	
	public Bark(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Bark))
			return false;
		if (o == this)
			return true;
		Bark other = (Bark)o;
		return this.sound.equalsIgnoreCase(other.getSound());
	}
}
