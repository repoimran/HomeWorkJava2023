package hw8Inheritance;

public class AnimalTest {

	public static void main(String args[]) {
		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		Reptile reptile = new Reptile();
		Birds birds = new Birds();
		Dog dog = new Dog();
		Snake snake = new Snake();
		Robin robin = new Robin();
		BullDog bullDog = new BullDog();
		Cobra cobra = new Cobra();

		animal.animalInfo(); // Super-class: None, dosen't extend anything; Sub-class: Reptile, Birds and all
								// other Classes;
		mammal.mammalInfo(); // Super-class: Animal, Sub-class: Dog <--- BullDog
		reptile.reptileInfo(); // Super-class: Animal, Sub-class: snake <--- Cobra;
		birds.birdsInfo(); // Super-class: Animal, Sub-class: Robin
		dog.dogInfo(); // Super-class: Mammal, Sub-class: BullDog
		snake.snakeInfo();// Super-class: Animal, Sub-class: Cobra
		robin.robinInfo();// Super-class: Animal, Sub-class: none
		bullDog.bullDogInfo();// Super-class: Animal <-- Mammal <-- Dog, Sub-class: none
		cobra.cobraInfo();// Super-class: Animal <-- Reptile <-- Snake, Sub-class: none

		mammal.animalInfo(); // child referance has access to parent(Animal) methods.
		reptile.animalInfo(); // child referance has access to parent(Animal) methods.
		birds.animalInfo(); // child referance has access to parent(Animal) methods.
		dog.animalInfo(); // child referance has access to parent(Animal) methods.
		snake.animalInfo(); // child referance has access to parent(Animal) methods.

		robin.birdsInfo(); // child referance has access to parent(Birds) methods.
		robin.animalInfo(); // grand-child referance has access to grand-parent(Animal) methods, Multi-Level
							// Inheritance

		bullDog.dogInfo(); // child referance has access to parent(Dog) methods.
		bullDog.animalInfo(); // grand-child referance has access to grand-parent(Animal) methods, Multi-Level
								// Inheritance

		snake.reptileInfo(); // child referance has access to parent(Reptile) methods.
		snake.animalInfo(); // grand-child referance has access to grand-parent(Animal) methods, Multi-Level
							// Inheritance

		// Hierarchical inheritance.....
		// Mammal class, Reptile class, Birds class they have Hierarchical inheritance
		// as they all extends Animal Class,
		// they all have a common parent(Animal);

	}
}
