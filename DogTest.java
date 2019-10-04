import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setName(){
        Dog dog = new Dog(null,null,null);
        String nameGiven = "Dixie";
        dog.setName(nameGiven);
        String dogName = dog.getName();

        Assert.assertEquals(dogName, nameGiven);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Dog dog = new Dog("bark",null,null);
        String name = "bark";
        String getNameResult = dog.getName();

        Assert.assertEquals(name, getNameResult);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        Dog dog = new Dog(null,null,null);
        Date givenBirthDate = new Date();
        dog.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Dog dog = new Dog(null, null,null);
        int numOfMealsEaten = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        int expectedFood = numOfMealsEaten + 1;

        Assert.assertEquals(expectedFood, actual);

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        Dog dog = new Dog(null,null,5);
        int expectedId = 5;
        int actualId = dog.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog(null,null,null);
        boolean actual = dog instanceof Animal;

        Assert.assertTrue(actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog(null,null,null);
        boolean actual = dog instanceof Mammal;

        Assert.assertTrue(actual);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
