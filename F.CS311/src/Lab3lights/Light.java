package Lab3lights;

public class Light {
	
	private boolean isOn;
	public Light() {
		this(false);
	}
	public Light(boolean isOn) {
		this.isOn = isOn;
	}
	public boolean isOn() { 
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public void randomChange() {
		if (Math.random() < .5) {
			this.setOn(true);
		} else {
			this.setOn(false);
		}
	}
	
}
