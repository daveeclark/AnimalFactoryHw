import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void add(){
        Dog dog = new Dog(null,null,12);
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(12);

        Assert.assertEquals(dog, actualDog);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeById() {
        Dog dog = new Dog(null, null, 5);
        DogHouse.add(dog);
        Dog actualDag = DogHouse.getDogById(5);

        Assert.assertEquals(dog, actualDag);

    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void remove(){
        Dog dog = new Dog(null,null,1);
        DogHouse.remove(dog.getId());
        Dog actualDog = DogHouse.getDogById(1);

        Assert.assertNull(actualDog);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById() {
        Dog dog = new Dog(null, null, 5);
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(5);

        Assert.assertEquals(dog, actualDog);

    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();

        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
