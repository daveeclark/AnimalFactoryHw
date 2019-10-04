import org.junit.Assert;
import org.junit.Test;

public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void add(){
        Cat cat = new Cat(null,null,12);
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(12);

        Assert.assertEquals(cat, actualCat);

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeTest() {
        Cat cat = new Cat(null, null, 8);
        CatHouse.remove(cat);
        Cat actualCat = CatHouse.getCatById(8);

        Assert.assertNull(actualCat);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void remove(){
        Cat cat = new Cat(null,null,1);
        CatHouse.remove(cat.getId());
        Cat actualCat = CatHouse.getCatById(1);

        Assert.assertNull(actualCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById() {
        Cat cat = new Cat(null, null, 5);
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(5);

        Assert.assertEquals(cat, actualCat);

    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Cat cat = new Cat(null,null,null);
        int expectedCat = CatHouse.getNumberOfCats()+1;
        CatHouse.add(cat);
        int actualCat = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCat, actualCat);
    }


}
