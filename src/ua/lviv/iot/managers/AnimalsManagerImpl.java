package ua.lviv.iot.managers;

import ua.lviv.iot.animals.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalsManagerImpl implements AnimalsManager {

	private List<Animals> animals = new LinkedList<>();

	public AnimalsManagerImpl(List<Animals> animals, boolean reverse) {
		this.animals = animals;
	}

	public AnimalsManagerImpl(List<Animals> animals) {
		this.animals = animals;
	}

	public AnimalsManagerImpl() {
		
	}

	

	public List<Animals> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animals> animals) {
		this.animals = animals;
	}

	public List<Animals> searchCarnivorousAnimals(TypeOfFood typeOfFood,  int minimumWeightOfConsumingMeal) {
		List<Animals> foundList;
		foundList = this.animals.stream().filter(gt -> typeOfFood.equals(gt.getTypeOfFood())
				&& gt.getWeightOfConsumingMeal() >= minimumWeightOfConsumingMeal).collect(Collectors.toList());
		return foundList;
	}

	  public List<Animals> sortCarnivorousAnimalsByEatingMeal( List<Animals> animals,  boolean reverse ,  final int minimumWeightOfConsumingMeal) {
		if (reverse) {
			Collections.sort(animals, Comparator.comparing(Animals::getWeightOfConsumingMeal).reversed());
		} else {
			Collections.sort(animals, Comparator.comparing(Animals::getWeightOfConsumingMeal));
		}
		return animals;
	}

	@Override
	public void addAnimal(Animals animal) {
		animals.add(animal);
		
	}
	

	

}
