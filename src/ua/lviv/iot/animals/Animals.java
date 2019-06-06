package ua.lviv.iot.animals;

public class Animals {
	
	protected static Sex sex;
	protected static TypeOfFood typeOfFood;
	protected static int weightOfConsumingMeal;
	protected static Size size;

	public Animals() {

	}

	public Animals( Sex sex, TypeOfFood typeOfFood, int weightOfConsumingMeal, Size size) {
		super();
		
		this.sex = sex;
		this.typeOfFood = typeOfFood;
		this.weightOfConsumingMeal = weightOfConsumingMeal;
		this.size = size;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public TypeOfFood getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(TypeOfFood typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public int getWeightOfConsumingMeal() {
		return weightOfConsumingMeal;
	}

	public void setWeightOfConsumingMeal(int weightOfConsumingMeal) {
		this.weightOfConsumingMeal = weightOfConsumingMeal;
	}

	public Enum<Size> getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	/*@Override
	public String toString() {
		return " [sex=" + sex + ", typeOfFood=" + typeOfFood + ", weightOfConsumingMeal=" + weightOfConsumingMeal
				+ ", size=" + size + "]";
	}

	

/*	@Override
	public String toString() {
		return "Animals [getSex()=" + getSex() + ", getTypeOfFood()=" + getTypeOfFood()
				+ ", getWeightOfConsumingMeal()=" + getWeightOfConsumingMeal() + ", getSize()=" + getSize() + "]";
	} */
	
	
	

}
