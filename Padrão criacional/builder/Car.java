package builder;

public class Car {
	private int wheels;
	private String color;
	
	@Override
	public String toString(){
		return "Car [wheels=" + wheels + ", color=" + color + "]";
	}
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
