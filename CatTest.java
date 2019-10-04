import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setName(){
        Cat cat = new Cat(null,null,null);
        String nameGiven = "Garfield";
        cat.setName(nameGiven);
        String catName = cat.getName();

        Assert.assertEquals(catName, nameGiven);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Cat cat = new Cat("meow",null,null);
        String name = "meow";
        String getNameResult = cat.getName();

        Assert.assertEquals(name, getNameResult);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        Cat cat = new Cat(null,null,null);
        Date givenBirthDate = new Date();
        cat.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Cat cat = new Cat(null, null,null);
        int numOfMealsEaten = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        int expectedFood = numOfMealsEaten + 1;

        Assert.assertEquals(expectedFood, actual);

    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getId(){
        Cat cat = new Cat(null,null,1);
        int expectedId = 1;
        int actualId = cat.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat(null,null,null);
        boolean actual = cat instanceof Animal;

        Assert.assertTrue(actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat(null,null,null);
        boolean actual = cat instanceof Mammal;

        Assert.assertTrue(actual);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }




}