package ua.lviv.iot.managers;

import ua.lviv.iot.animals.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnimalsManagerImplTest {
	private static AnimalsManager animalsManager;
	private List<Animals> animals;

	@BeforeEach
	public void setUp() {
		animalsManager = new AnimalsManagerImpl();
		animalsManager.addAnimal(new PolarFox(Sex.MALE, TypeOfFood.CARNIVOROUS, 4, Size.BIG, 5, 4));
		animalsManager.addAnimal(new WhiteBear(Sex.MALE, TypeOfFood.CARNIVOROUS, 3, Size.BIG, 4, 4));
		animalsManager.addAnimal(new Reindeer(Sex.FEMALE, TypeOfFood.CARNIVOROUS, 6, Size.MEDIUM, 1, 3));
		PolarFox polarFox = new PolarFox(Sex.MALE, TypeOfFood.CARNIVOROUS, 4, Size.BIG, 5, 4);
		WhiteBear whiteBear = new WhiteBear(Sex.MALE, TypeOfFood.CARNIVOROUS, 3, Size.BIG, 4, 4);
		Reindeer reindeer = new Reindeer(Sex.FEMALE, TypeOfFood.CARNIVOROUS, 6, Size.MEDIUM, 1, 3);
		animals.add(polarFox);
		animals.add(whiteBear);
		animals.add(reindeer);
	}

	@Test
	@DisplayName(value = "Finding carnivorous animals which eat minimum 5 kg of meal")
	final void testSearchCarnivousAnimals() {
		Assertions.assertEquals(3, animalsManager.searchCarnivorousAnimals(TypeOfFood.CARNIVOROUS, 2).size());
	}

	@Test
	@DisplayName(value = "Sort  animals by eating meal by descending")
	final void testByEatingMealByDescending() {
		animalsManager.sortCarnivorousAnimalsByEatingMeal(animals, false, 3);
		Assertions.assertEquals(6, animals.get(2).getWeightOfConsumingMeal());
		Assertions.assertEquals(4, animals.get(1).getWeightOfConsumingMeal());
		Assertions.assertEquals(3, animals.get(0).getWeightOfConsumingMeal());
	}

	@Test
	@DisplayName(value = "Sort  animals by eating meal by ascending")
	final void testByEatingMealByAscending() {
		animalsManager.sortCarnivorousAnimalsByEatingMeal(animals, true, 3);
		Assertions.assertEquals(3, animals.get(2).getWeightOfConsumingMeal());
		Assertions.assertEquals(4, animals.get(1).getWeightOfConsumingMeal());
		Assertions.assertEquals(5, animals.get(0).getWeightOfConsumingMeal());
	}

	@Test
	@DisplayName("Add null element to list of stationary")
	final void testListWithNewNullElement() {
		animalsManager.addAnimal(null);
		Assertions.assertEquals(0, animals.size());
	}
}
