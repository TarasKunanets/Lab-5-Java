package ua.lviv.iot.managers;

import java.util.List;

import ua.lviv.iot.animals.TypeOfFood;
import ua.lviv.iot.animals.Animals;
import ua.lviv.iot.animals.PolarFox;

public interface AnimalsManager {
	
  public List<Animals> searchCarnivorousAnimals( TypeOfFood typeOfFood, final int minimumWeightOfConsumingMeal );

  public List<Animals> sortCarnivorousAnimalsByEatingMeal( List<Animals> animals,  boolean reverse ,  final int minimumWeightOfConsumingMeal);



public void addAnimal(Animals animal);


  
  


}
