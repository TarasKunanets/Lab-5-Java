package ua.lviv.iot.animals;

public class PolarFox extends Animals {
	private int speed;
	private double height;
	public PolarFox(Sex sex,TypeOfFood typeOfFood,int weightOfConsumingMeal,Size size, int speed, double height) {
		super(sex, typeOfFood, weightOfConsumingMeal, size);
		this.speed = speed;
		this.height = height;
	}
	


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void add(PolarFox polarFox) {
		// TODO Auto-generated method stub
		
	}
	
	
}
