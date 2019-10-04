import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AnimalFactoryTest {
        //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        Date date = new Date();
        Dog dog = AnimalFactory.createDog("joe", new Date());
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals("joe", actualName);
        Assert.assertEquals(date, actualDate);
    }

        //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
        @Test
    public void createCatTest(){
        Date date = new Date();
        Cat cat = AnimalFactory.createCat("tiger", new Date());
        String actualName = cat.getName();
        }
}
