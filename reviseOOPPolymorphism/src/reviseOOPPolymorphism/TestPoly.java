/**
 * 
 */
package reviseOOPPolymorphism;

/**
 * 
 */
public class TestPoly {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.makeNoise();

		Dog d1 = new Dog();
		d1.makeNoise();
		d1.setLicenseNo(234);
		

		Lion l1 = new Lion();
		l1.makeNoise();

		System.out.println();
		
		
		//array to print animals
		Animal[] animals = { a1, d1, l1 };

		for (Animal animal : animals) {
			animal.makeNoise();
		}
		System.out.println();
		
		makeAnimalNoise(d1);
		makeAnimalNoise(l1);
		makeAnimalNoise(a1);
	}

	public static void makeAnimalNoise(Animal animal) {
		animal.makeNoise();
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			System.out.println("Dog number : "+dog.getLicenseNo());
		}
	}
}
