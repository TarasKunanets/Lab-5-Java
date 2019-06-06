package ua.lviv.iot.animals;

public class Reindeer extends Animals {
	private double weight;
	private int age;
	
	

	public Reindeer(Sex sex,TypeOfFood typeOfFood,int weightOfConsumingMeal,Size size, double weight, int age) {
		super(sex, typeOfFood, weightOfConsumingMeal, size);
		this.weight = weight;
		this.age = age;
	}

	
	
	



	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
